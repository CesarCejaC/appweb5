package com.example.appweb5.model;

import javax.persistence.*;

@Entity
@Table(name = "juegos")
public class Game {

    public Game() {
    }

    public Game(String nombreJuego, String descripcionJuego) {

        this.nombreJuego = nombreJuego;
        this.descripcionJuego = descripcionJuego;
    }

    @Id
    @Column(name = "nombre_juego", nullable = false)
    private String nombreJuego;

    @Column(name = "descripcion", nullable = false)
    private String descripcionJuego;

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
