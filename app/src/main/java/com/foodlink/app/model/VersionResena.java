package com.foodlink.app.model;

import java.time.LocalDateTime;

public class VersionResena extends EntidadBase{

    private byte estrellas;
    private String comentario;
    private LocalDateTime fecha;

    public VersionResena(){
        super();
    }

    public VersionResena(byte estrellas, String comentario, LocalDateTime fecha) {
        super();
        this.estrellas = estrellas;
        this.comentario = comentario;
        this.fecha = fecha;
    }

    public VersionResena(Long id, byte estrellas, String comentario, LocalDateTime fecha) {
        super(id);
        this.estrellas = estrellas;
        this.comentario = comentario;
        this.fecha = fecha;
    }
}
