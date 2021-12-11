package com.bl.entities;

public class Nodo {

    // A utility function to find the vertex with minimum distance value,
    // from the set of vertices not yet included in shortest path tree

    Nodo siguiente;
    int data;

    public Nodo() {
    }


    public Nodo(int x) {
        data = x;
        siguiente = null;
    }
}
