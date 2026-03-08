package com.foodlink.app.model;

public class Restaurante extends EntidadBase{


    private String nombre;
    private String direccion;
    private String descripcion;
    private String telefono;
    private double ratingPromedio;


    private final Menu menu;
    private Categoria categoria;

    public Restaurante(Menu menu){
        super();
        this.menu = menu;
    }
    public Restaurante(String nombre, String direccion, String descripcion, String telefono, double ratingPromedio, String nombreMenu){
        super();
        this.nombre = nombre;
        this. direccion = direccion;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.ratingPromedio = ratingPromedio;
        this.menu = new Menu(nombreMenu);
    }

    public Restaurante(Long id, String nombre, String direccion, String descripcion, String telefono, double ratingPromedio, String nombreMenu){
        super(id);
        this.nombre = nombre;
        this. direccion = direccion;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.ratingPromedio = ratingPromedio;
        this.menu = new Menu(nombreMenu);
    }

    public double calcularRating() {

        return 0;
    }
    public Menu obtenerMenu(){
        return null;
    }


}
