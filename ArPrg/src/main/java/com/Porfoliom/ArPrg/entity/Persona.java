
package com.Porfoliom.ArPrg.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id; 


@Entity
public class Persona {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;    
    private String nombre;
    private String apellido;
    private String titulo;
    private String foto;
    
    @Column(length=1000)
    private String descripcion;
    private String email;
    private String pasword;
    
    public Persona(String nombre, String apellido, String titulo, String foto, String descripcion, String email, String pasword) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.foto = foto;
        this.descripcion = descripcion;
        this.email = email;
        this.pasword = pasword;
    }

    public Persona() {
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    
    
    
}
