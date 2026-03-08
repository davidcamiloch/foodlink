package com.foodlink.app.model;

public class Usuario extends EntidadBase{

    private String nombre;
    private String email;
    private String password;
    private String fotoPerfil;

    public Usuario() {
        super();
    }

    public Usuario(String nombre, String email, String password, String fotoPerfil) {
        super();
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.fotoPerfil = fotoPerfil;
    }

    public Usuario(Long id, String nombre, String email, String password, String fotoPerfil) {
        super(id);
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.fotoPerfil = fotoPerfil;
    }

    public Resena crearReseña(Plato plato, byte estrellas, String comentario){

        return null;
    }
    public void editarReseña(Resena resena, byte estrellas, String comentario){

    }
}
