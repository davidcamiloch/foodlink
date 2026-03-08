package com.foodlink.app.model;

import com.foodlink.app.util.Pila;

import java.time.LocalDateTime;

public class Resena extends EntidadBase{
    private byte estrella;
    private String comentario;
    private LocalDateTime fecha;
    private Pila<VersionResena> historialEdiciones = new Pila<>();

    public Resena() {
        super();
    }

    public Resena(byte estrella, String comentario, LocalDateTime fecha) {
        super();
        this.estrella = estrella;
        this.comentario = comentario;
        this.fecha = fecha;
        agregarVersion(estrella, comentario, fecha);
    }

    public Resena(Long id, byte estrella, String comentario, LocalDateTime fecha) {
        super(id);
        this.estrella = estrella;
        this.comentario = comentario;
        this.fecha = fecha;
        agregarVersion(estrella, comentario, fecha);
    }

    //metodos

    private void agregarVersion(Byte estrella, String comentario, LocalDateTime fecha) {
        historialEdiciones.apilar(new VersionResena(estrella, comentario, fecha));
    }

    public void editar(int estrellas, String comentario) {

    }
    public void eliminar(){

    }
}
