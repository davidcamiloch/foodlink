package com.foodlink.app.model;

import com.foodlink.app.util.ListaCD;

public class Plato extends EntidadBase{

    private String nombre;
    private String descripcion;
    private double precio;
    private double ratingPromedio;
    private ListaCD<Resena> resenas = new ListaCD<>();


    //constructor

    public Plato() {
        super();
    }

    public Plato(String nombre, String descripcion, double precio, double ratingPromedio, ListaCD<Resena> resenas) {
        super();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.ratingPromedio = ratingPromedio;
        this.resenas = resenas;
    }

    public Plato(Long id, String nombre, String descripcion, double precio, double ratingPromedio, ListaCD<Resena> resenas) {
        super(id);
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.ratingPromedio = ratingPromedio;
        this.resenas = resenas;
    }

    //metodos
    public void agregarReseña(Resena resena) {
        resenas.insertarAlFinal(resena);
    }
    public double calcularRating() {

        return 0;
    }
    public double getRating(){

        return 0;
    }

}
