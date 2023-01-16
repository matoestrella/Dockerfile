
package com.Porfoliom.ArPrg.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Experiencia {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;    
    private String empresa;
    private String periodo;
   
    @Column(length=1000)
    private String descripcion;

    public Experiencia() {
    }

    public Experiencia(String empresa, String periodo, String descripcion) {
        this.empresa = empresa;
        this.periodo = periodo;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
