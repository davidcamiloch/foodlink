package com.foodlink.app.model;

import com.foodlink.app.util.ColaP;

public class Menu {
    private ColaP<Plato> platos;

    public Menu(){

    }

    public Menu(ColaP<Plato> platos){
        this.platos = platos;
    }


}
