package com.example.appweb5.model;

import javax.persistence.*;

@Entity
@Table(name = "resenias")
public class Review {

    public Review() {
    }

    public Review(Long id_usuario, Long id_juego, Integer calificacion, String descripcion) {
        this.id_usuario = id_usuario;
        this.id_juego = id_juego;
        this.calificacion = calificacion;
        this.descripcion = descripcion;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_resenia", nullable = false)
    private Long id;

    @Column(name = "id_usuario", nullable = false)
    private Long id_usuario;

    @Column(name = "id_juego", nullable = false)
    private Long id_juego;

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

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Long getId_juego() {
        return id_juego;
    }

    public void setId_juego(Long id_juego) {
        this.id_juego = id_juego;
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
