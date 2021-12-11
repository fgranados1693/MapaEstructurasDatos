package com.bl.entities;

public class Paises {

    static final int V = 25;
    private String nombres;


    public Paises(String nombres) {
        this.nombres = nombres;
    }


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
    }

    public static int getV() {
        return V;
    }

}

