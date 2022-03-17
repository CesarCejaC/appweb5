package com.example.appweb5.DTO;

public class GameDTO {
    private Long id;
    private String nombreJuego;
    private String descripcionJuego;

    public GameDTO() {
    }

    public GameDTO(Long id, String nombreJuego, String descripcionJuego) {
        this.id = id;
        this.nombreJuego = nombreJuego;
        this.descripcionJuego = descripcionJuego;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public String getDescripcionJuego() {
        return descripcionJuego;
    }

    public void setDescripcionJuego(String descripcionJuego) {
        this.descripcionJuego = descripcionJuego;
    }

}
