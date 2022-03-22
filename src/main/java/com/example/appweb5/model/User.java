package com.example.appweb5.model;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class User {

    public User() {
    }

    public User(String nombre_usuario, String email_usuario, String password_usuario, int tipo_usuario) {
        this.nombre_usuario = nombre_usuario;
        this.email_usuario = email_usuario;
        this.password_usuario = password_usuario;
        this.tipo_usuario = tipo_usuario;
    }

    @Id
    @Column(name = "nombre_usuario", nullable = false)
    private String nombre_usuario;

    @Column(name = "email_usuario", nullable = false, unique = true)
    private String email_usuario;

    @Column(name = "password_usuario", nullable = false)
    private String password_usuario;

    @Column(name = "tipo_usuario", nullable = false )
    private Integer tipo_usuario;

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public String getPassword_usuario() {
        return password_usuario;
    }

    public void setPassword_usuario(String password_usuario) {
        this.password_usuario = password_usuario;
    }

    public Integer getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(Integer tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }
}