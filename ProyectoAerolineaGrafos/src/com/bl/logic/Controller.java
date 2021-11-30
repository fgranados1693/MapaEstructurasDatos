package com.bl.logic;

import com.bl.entities.Grafo;

import java.util.Scanner;

public class Controller {

    private static Scanner scan = new Scanner(System.in);

    public static void implementarTrayectoMin(){
        /* Let us create the example graph discussed above */
        int graph[][] = new int[][] {
                { 0, 200, 0, 150, 0, 0, 0 },
                { 0, 0, 100, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 25 },
                { 0, 0, 500, 0, 200, 0, 0 },
                { 0, 0, 0, 0, 0, 175, 0 },
                { 0, 0, 250, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 300, 0, 0 }
        };
        Grafo t = new Grafo();
        // Origen es de 0 a 6 y Destino es de 1 a 7
        t.dijkstra(graph, 5, 4);

        //returns true when arista exists
        imprimir("" + t.existeArista(graph, 4, 4 ));
       // t.primeroListaAdy(graph, 0);

        t.imprimirGrafo(graph);
        t.verticesAdyacentes(graph, 0);
    }

    private static void imprimir(String pData) {
        System.out.println(pData);
    }

}
