package com.ar.moku.portfolio.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Perfil implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nombre;
    private String apellido;
    private String ocupacion;
    private String email;
    private String fechaNac;
    private String nacionalidad;
    private String residencia;
    private String sobreMi;
    private String cita;
    private String autor;
    private String imageProfile;

    public Perfil() {
    }

    public Perfil(Long id, String nombre, String apellido, String ocupacion, String email, String fechaNac, String nacionalidad, String residencia, String sobreMi, String cita, String autor, String imageProfile) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.email = email;
        this.fechaNac = fechaNac;
        this.nacionalidad = nacionalidad;
        this.residencia = residencia;
        this.sobreMi = sobreMi;
        this.cita = cita;
        this.autor = autor;
        this.imageProfile = imageProfile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getSobreMi() {
        return sobreMi;
    }

    public void setSobreMi(String sobreMi) {
        this.sobreMi = sobreMi;
    }

    public String getCita() {
        return cita;
    }

    public void setCita(String cita) {
        this.cita = cita;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getImageProfile() {
        return imageProfile;
    }

    public void setImageProfile(String imageProfile) {
        this.imageProfile = imageProfile;
    }

    @Override
    public String toString() {
        return "Perfil{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", ocupacion=" + ocupacion + ", email=" + email + ", fechaNac=" + fechaNac + ", nacionalidad=" + nacionalidad + ", residencia=" + residencia + ", sobreMi=" + sobreMi + ", cita=" + cita + ", autor=" + autor + ", imageProfile=" + imageProfile + '}';
    }
    
}
