package com.bl.entities;

import java.util.ArrayList;

import static com.bl.entities.Paises.V;

public class Grafo {

    //Función vecinos
    public ArrayList<String> verticesAdyacentes(int[][] grafo, int vertice, ArrayList<String> nombresPaises) {

        ArrayList<Integer> listaAdyacencia = new ArrayList<>();
        ArrayList<String> nombresPaisesVecinos = new ArrayList<>();

        int cont = 0;
        for (int Linea = 0; Linea < V; ++Linea) {
            for (int Columna = 0; Columna < grafo.length; ++Columna) {
                if (Linea == vertice) {
                    if (grafo[vertice][Columna] != grafo[vertice][0]) {
                        listaAdyacencia.add(Columna);
                        nombresPaisesVecinos.add(nombresPaises.get(listaAdyacencia.get(cont)));
                        cont++;
                    }
                }
            }
        }

       return nombresPaisesVecinos;
    }
}
