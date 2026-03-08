package com.foodlink.app.model;

import com.foodlink.app.util.ColaP;
import com.foodlink.app.util.ListaCD;

public class Menu extends EntidadBase{
    private ColaP<Plato> platos = new ColaP<>();
    private String nombre;


    public Menu(String nombre){
        super();
        this.nombre = nombre;
    }

    public Menu(Long id, String nombre){
        super(id);
    }


    public void agregarPlato(Plato plato){
        platos.enColar(plato);
    }

    public void eliminarPlato(Plato plato){

    }

    public Plato obtenerPlatoTop(){

        return null;
    }

    public ListaCD<Plato> listarPlatos(){

        return null;
    }

    public void actualizarPrioridad(Plato plato){

    }

}
