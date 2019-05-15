
package com.example.domain.children;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;


public class Children implements Serializable {

    private long key;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String tipoSangre;
    private String documentoIdentidad;
    private int KeyPersona;
    private Date fechaRegistro;
    private Date fechaModificacion;

    public Children() {

    }

    public Children(long key, String nombre, String apellido, Date fechaNacimiento, String tipoSangre,
                    String documentoIdentidad, int KeyPersona, Date fechaRegistro, Date fechaModificacion) {
        this.key = key;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
        this.documentoIdentidad = documentoIdentidad;
        this.KeyPersona = KeyPersona;
        this.fechaRegistro = fechaRegistro;
        this.fechaModificacion = fechaModificacion;
    }

    public long getKey() {
        return key;
    }

    public void setKey(long key) {
        this.key = key;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public int getKeyPersona() {
        return KeyPersona;
    }

    public void setKeyPersona(int KeyPersona) {
        this.KeyPersona = KeyPersona;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Children children = (Children) o;
        return key == children.key &&
        KeyPersona == children.KeyPersona &&
        Objects.equals(nombre, children.nombre) &&
        Objects.equals(apellido, children.apellido) &&
        Objects.equals(fechaNacimiento, children.fechaNacimiento) &&
        Objects.equals(tipoSangre, children.tipoSangre) &&
        Objects.equals(documentoIdentidad, children.documentoIdentidad) &&
        Objects.equals(fechaRegistro, children.fechaRegistro) &&
        Objects.equals(fechaModificacion, children.fechaModificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, nombre, apellido, fechaNacimiento,
        tipoSangre, documentoIdentidad, KeyPersona, fechaRegistro,
        fechaModificacion);
    }

    @Override
    public String toString() {
        return "{" +
                "key=" + key +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", tipoSangre='" + tipoSangre + '\'' +
                ", documentoIdentidad='" + documentoIdentidad + '\'' +
                ", KeyPersona=" + KeyPersona +
                ", fechaRegistro=" + fechaRegistro +
                ", fechaModificacion=" + fechaModificacion +
                '}';
    }
}
