/*
 * Copyright 2017 brayan.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.domain.person;



import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;


public class Person implements Serializable {

    private Long key;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String cedula;
    private Float altura;
    private String telefono;
    private String correo;
    private Date fechaRegistro;
    private Date fechaModificacion;

    public Person(Long key, String nombre, String apellido, Date fechaNacimiento, String cedula, Float altura,
                  String telefono, String correo, Date fechaRegistro, Date fechaModificacion) {
        this.key = key;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
        this.altura = altura;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaRegistro = fechaRegistro;
        this.fechaModificacion = fechaModificacion;
    }

    public Person() {

    }

    public Long getKey() {
        return key;
    }

    public void setKey(Long key) {
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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
        Person person = (Person) o;
        return Objects.equals(key, person.key) &&
        Objects.equals(nombre, person.nombre) &&
        Objects.equals(apellido, person.apellido) &&
        Objects.equals(fechaNacimiento, person.fechaNacimiento) &&
        Objects.equals(cedula, person.cedula) &&
        Objects.equals(altura, person.altura) &&
        Objects.equals(telefono, person.telefono) &&
        Objects.equals(correo, person.correo) &&
        Objects.equals(fechaRegistro, person.fechaRegistro) &&
        Objects.equals(fechaModificacion, person.fechaModificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, nombre, apellido, fechaNacimiento, cedula,
        altura, telefono, correo, fechaRegistro, fechaModificacion);
    }

    @Override
    public String toString() {
        return "{" +
                "key=" + key +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", cedula='" + cedula + '\'' +
                ", altura=" + altura +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", fechaRegistro=" + fechaRegistro +
                ", fechaModificacion=" + fechaModificacion +
                '}';
    }
}
