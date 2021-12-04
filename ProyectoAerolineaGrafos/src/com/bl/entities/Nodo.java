package com.bl.entities;

public class Nodo {

    // A utility function to find the vertex with minimum distance value,
    // from the set of vertices not yet included in shortest path tree

    Nodo siguiente;
    int data;

    static final int V = 25;
    private String[] nombres = {"Canadá", "Los Angeles", "New York","México","Costa Rica","Colombia","Perú","Brasil",
            "Argentina", "Portugal","España","Inglaterra","Francia","Italia","Alemania", "Suecia","Rusia","Egipto",
            "India","China","Japón","Australia","Sudáfrica","Madagascar", "Nigeria"};

    public Nodo() {
    }


    public Nodo(int x) {
        this.nombres = nombres;
        data = x;
        siguiente = null;
    }

    public static int getV() {
        return V;
    }

    public String[] getNombres() {
        return nombres;
    }

    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }
}
