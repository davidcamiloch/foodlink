package com.foodlink.app.model;

import com.foodlink.app.util.ListaCD;

import java.time.LocalDate;

public class Categoria extends EntidadBase{

    private String nombre;
    private String descripcion;
    private ListaCD<Restaurante> restaurantes;



    public Categoria(){
        super();
    }

    public Categoria(String nombre, String descripcion) {
        super();
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Categoria(Long id, String nombre, String descripcion){
        super(id);
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void agregarRestaurante(Restaurante restaurante){

    }
    public ListaCD<Restaurante> listarRestaurantes() {

        return null;
    }
}
