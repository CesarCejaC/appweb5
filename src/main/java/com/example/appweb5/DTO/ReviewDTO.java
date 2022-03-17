package com.example.appweb5.DTO;

public class ReviewDTO {
    private Long id;
    private Long id_usuario;
    private Long id_juego;
    private Integer calificacion;
    private String descripcion;

    public ReviewDTO() {
    }

    public ReviewDTO(Long id, Long id_usuario, Long id_juego, Integer calificacion, String descripcion) {
        this.id = id;
        this.id_usuario = id_usuario;
        this.id_juego = id_juego;
        this.calificacion = calificacion;
        this.descripcion = descripcion;
    }

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
