package com.foodlink.app.model;

public class Restaurante {


    private String nombre;
    private String direccion;
    private String descripcion;
    private String telefono;
    private double ratingPromedio;


    private Menu menu;


    public Restaurante(){

    }
    public Restaurante(String nombre, String direccion, String descripcion, String telefono, double ratingPromedio, Menu menu){
        this.nombre = nombre;
        this. direccion = direccion;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.ratingPromedio = ratingPromedio;
        this.menu = menu;
    }

    public double calcularRating() {

        return 0;
    }
    public Menu obtenerMenu(){
        return null;
    }


}
