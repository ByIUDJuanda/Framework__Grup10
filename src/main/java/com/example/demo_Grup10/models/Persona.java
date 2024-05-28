package com.example.demo_Grup10.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name ="nombre")     
    private String nombre;

    @Column(name ="celular")
    private String celular;

    @Column(name ="email" )
    private String email;

    public Persona() {

    }

    public Persona(int id, String nombre, String celular, String email) {
        this.id = id;
        this.nombre = nombre;
        this.celular = celular;
        this.email = email;
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

    public String getCelular() {
        return celular; 
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email; 
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
