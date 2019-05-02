package com.example.infraestructure.mail;

import org.apache.log4j.Logger;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

/**
 * Debes activar esto para poder accesar a gmail.com
 * Conexion conexiones no encriptadas.
 *
 * https://www.google.com/settings/security/lesssecureapps
 */
public class EmailManager {

    private final Logger log = Logger.getLogger(EmailManager.class);

    private final Session session;
    private final Properties props;

    private final String email = "brayanmartinez827@gmail.com";
    private final String emailPass = "";
    private final String personal = "Mi firma de Correo";



    public EmailManager() {

        //Propiedades de la secion.
        this.props = new Properties();

        this.props.put("mail.smtp.socketFactory.port", "587");
        this.props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        this.props.put("mail.smtp.auth", "true");
        this.props.put("mail.smtp.starttls.enable", "true");
        this.props.put("mail.smtp.host", "smtp.gmail.com");
        this.props.put("mail.smtp.port", "587");

        //Crear la secion.
        this.session = Session.getInstance(props, new GMailAuthenticator(email, emailPass));
    }


    /**
     * Enviar el correo.
     * @param correo El correo a enviar.
     */
    public void sendMessage(Correo correo) {
        final MimeMessage message = new MimeMessage(session);

        try {
            message.setRecipient(Message.RecipientType.TO, InternetAddress.parse(correo.getRecepient())[0]);
            message.setContent(correo.getMsg(), "text/html; charset=utf-8");
            message.setSubject(correo.getSubject());
            message.setFrom(new InternetAddress(email, personal));

            Transport.send(message);

        } catch (MessagingException ex) {
            this.log.error(ex.getMessage());

        } catch (UnsupportedEncodingException ex) {
            this.log.error(ex.getMessage());

        } finally {
            this.log.info("Se ha enviado un correo.");

        }
    }



}