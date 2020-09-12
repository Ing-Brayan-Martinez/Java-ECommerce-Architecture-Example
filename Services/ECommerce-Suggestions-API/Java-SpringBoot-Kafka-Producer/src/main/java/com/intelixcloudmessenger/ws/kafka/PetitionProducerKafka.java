package com.intelixcloudmessenger.ws.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class PetitionProducerKafka {

    private static final Logger log = LoggerFactory.getLogger(PetitionProducerKafka.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMail(String message){
        log.info("sending message='{}' to topic='{}'", message, "mensageria");
        kafkaTemplate.send("mensageria", message);
    }

    public void sendSMS(String message){
        log.info("sending message='{}' to topic='{}'", message, "mensageria");
        kafkaTemplate.send("test", message);
    }
}
