package com.example.appweb5.model;

import javax.persistence.*;

@Entity
@Table(name = "juegos")
public class Game {

    public Game() {
    }

    public Game(long id, String nombreJuego, String descripcionJuego) {
        this.id = id;
        this.nombreJuego = nombreJuego;
        this.descripcionJuego = descripcionJuego;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_juego", nullable = false)
    private long id;

    @Column(name = "nombre_juego", nullable = false)
    private String nombreJuego;

    @Column(name = "descripcion_juego", nullable = false)
    private String descripcionJuego;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
