package com.bl.entities;

public class Nodo {

    // A utility function to find the vertex with minimum distance value,
    // from the set of vertices not yet included in shortest path tree

    static final int V = 7;
    private String[] nombres = {"España","Portugal","Italia","Francia","Inglaterra","Suecia","Escocia"};

    public Nodo() {
    }

    public Nodo(String[] nombres) {
        this.nombres = nombres;
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
