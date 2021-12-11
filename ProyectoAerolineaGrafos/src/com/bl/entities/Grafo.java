package com.bl.entities;

import com.bl.logic.AppController;
import com.ui.controller.vecinosController;

import java.util.ArrayList;

import static com.bl.entities.Paises.V;


public class Grafo {
    private static vecinosController vController = new vecinosController();

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
                        System.out.println("Vértice adyancente de " + nombresPaisesVecinos.get(cont));
                        cont++;
                    }
                }
            }
        }

       return nombresPaisesVecinos;
    }
}
