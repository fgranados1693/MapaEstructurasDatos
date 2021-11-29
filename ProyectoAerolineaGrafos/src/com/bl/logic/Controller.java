package com.bl.logic;

import com.bl.entities.Grafo;

public class Controller {

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
        t.dijkstra(graph, 1, 7);
    }

}
