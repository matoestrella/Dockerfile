
package com.Porfoliom.ArPrg.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Proyectos {
      @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;    
    private String nombre;
    private String imagen;
    private String URL;
    
    @Column(length=1000)
    private String descripcion;

    public Proyectos() {
    }

    public Proyectos(String nombre, String imagen, String URL, String descripcion) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.URL = URL;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
    
}
