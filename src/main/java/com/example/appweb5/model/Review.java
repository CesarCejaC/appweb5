package com.example.appweb5.model;

import javax.persistence.*;

@Entity
@Table(name = "resenias")
public class Review {

    public Review() {
    }

    public Review(String nombre_usuario, String nombre_juego, Integer calificacion, String descripcion) {
        this.nombre_usuario = nombre_usuario;
        this.nombre_juego = nombre_juego;
        this.calificacion = calificacion;
        this.descripcion = descripcion;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_resenia", nullable = false)
    private Long id;

    @Column(name = "nombre_usuario", nullable = false)
    private String nombre_usuario;

    @Column(name = "nombre_juego", nullable = false)
    private String nombre_juego;

    @Column(name = "calificacion", nullable = false)
    private Integer calificacion;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getNombre_juego() {
        return nombre_juego;
    }

    public void setNombre_juego(String nombre_juego) {
        this.nombre_juego = nombre_juego;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
