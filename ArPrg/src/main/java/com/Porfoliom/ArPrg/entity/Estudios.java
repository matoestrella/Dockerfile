
package com.Porfoliom.ArPrg.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Estudios {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;    
    private String institucion;
    private String nivel;
    private String titulo;
    private Date periodo;
    
    @Column(length=1000)
    private String descripcion;

    public Estudios() {
    }

    public Estudios(String institucion, String nivel, String titulo, Date periodo, String descripcion) {
        this.institucion = institucion;
        this.nivel = nivel;
        this.titulo = titulo;
        this.periodo = periodo;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Date periodo) {
        this.periodo = periodo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
