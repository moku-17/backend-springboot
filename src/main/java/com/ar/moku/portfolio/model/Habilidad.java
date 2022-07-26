package com.ar.moku.portfolio.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Habilidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nombre;
    private String tipo;
    private String nivel;
    private String imageIcon;
    @Column(nullable = false, updatable = false)
    private Integer personaId;

    public Habilidad() {
    }

    public Habilidad(Long id, String nombre, String tipo, String nivel, String imageIcon, Integer personaId) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.imageIcon = imageIcon;
        this.personaId = personaId;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(String imageIcon) {
        this.imageIcon = imageIcon;
    }

    public Integer getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Integer personaId) {
        this.personaId = personaId;
    }

    @Override
    public String toString() {
        return "Habilidad{" + "id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", nivel=" + nivel + ", imageIcon=" + imageIcon + ", personaId=" + personaId + '}';
    }
}
