package com.example.appweb5.DTO;

public class ReviewDTO {
    private Long id;
    private String nombre_usuario;
    private String nombre_juego;
    private Integer calificacion;
    private String descripcion;

    public ReviewDTO() {
    }

    public ReviewDTO(Long id, String nombre_usuario, String nombre_juego, Integer calificacion, String descripcion) {
        this.id = id;
        this.nombre_usuario = nombre_usuario;
        this.nombre_juego = nombre_juego;
        this.calificacion = calificacion;
        this.descripcion = descripcion;
    }

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
