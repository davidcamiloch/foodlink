package com.foodlink.app.model;

import java.time.LocalDateTime;

public abstract class EntidadBase {
    protected Long id;
    protected LocalDateTime fechaCreacion;


    public EntidadBase() {
        this.fechaCreacion = LocalDateTime.now();
    }


    public EntidadBase(Long id) {
        this.fechaCreacion = LocalDateTime.now();
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }
}
