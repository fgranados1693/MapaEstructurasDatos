package com.bl.logic;

import com.bl.entities.Dijkstra;
import com.bl.entities.Grafo;
import com.bl.entities.HashingAbierto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Controller {

    //PRUEBA PRUEBA

    public static void implementarTrayectoMin(){
        /* Let us create the example graph discussed above */
        int graph[][] = new int[][]{
                { 0, 100, 150, 300, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 100, 0, 125, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 150, 125, 0, 150, 200, 0, 0, 0, 0, 1500, 0, 2000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 300, 100, 150, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 200, 100, 0, 50, 100, 350, 400, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 50, 0, 25, 200, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 100, 25, 0, 100, 250, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 350, 200, 100, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 700, 0, 550 },
                { 0, 0, 0, 0, 400, 0, 250, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1500, 0, 0, 0, 0, 0, 0, 0, 50, 100, 75, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 250 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 50, 0, 0, 25, 60, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 300 },
                { 0, 0, 2000, 0, 0, 0, 0, 0, 0, 100, 0, 0, 50, 0, 0, 125, 375, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 75, 25, 50, 0, 30, 30, 125, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 60, 0, 30, 0, 25, 0, 0, 150, 0, 0, 0, 0, 0, 0, 400 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 30, 25, 0, 150, 0, 200, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 125, 0, 0, 150, 0, 200, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 375, 0, 0, 0, 200, 0, 400, 900, 800, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 150, 200, 0, 400, 0, 300, 0, 0, 0, 0, 250, 150 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 900, 300, 0, 200, 0, 250, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 800, 0, 200, 0, 150, 230, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 150, 0, 300, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 250, 230, 300, 0, 0, 500, 0 },
                { 0,0, 0, 0, 0, 0, 0, 700, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 275 },
                { 0,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 250, 0, 0, 0, 500, 100, 0, 200 },
                { 0,0, 0, 0, 0, 0, 0, 550, 0, 250, 300, 0, 0, 400, 0, 0, 0, 150, 0, 0, 0, 0, 275, 200, 0 }

        };
        Grafo t = new Grafo();
        // Origen es de 0 a 6 y Destino es de 1 a 7
        //t.dijkstra(graph, 0, 5);

        //HashingAbierto tablaHash = new HashingAbierto(2);
        //tablaHash.insertar();
        //tablaHash.mostrarTablaHash();

        //String key = "Costa de Marfil";
        //System.out.println("Existe el valor "+key+": " + tablaHash.buscar(key));

        // Otra implementacion

        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Canadá");
        nombres.add("Los Angeles");
        nombres.add("New York");
        nombres.add("México");
        nombres.add("Costa Rica");

        int src = 1 - 1, dest = 5 - 1;
        Dijkstra dijkstra = new Dijkstra();
        dijkstra.shortestPath(graph,src,dest);
        System.out.print("Camino más corto: ");
        System.out.println(dijkstra.path);
        mostrarNombresCaminoCorto(dijkstra.path, nombres, src, dest);

        // Imprimir nombres de los paises  *******************


        //find2ndShortest(adjacencyMatrix,src,dest);

        List<Integer> list = new ArrayList<Integer>(dijkstra.allDists);
        System.out.println("Distancia más corta: " + list.get(0));
        //System.out.println("2nd shortest distance: " + list.get(1));

    }

    public static void mostrarNombresCaminoCorto(Set<Integer> path, ArrayList<String> nombresPaises, int origen, int destino) {

        if(origen < destino) {

            for(int i = 0; i < path.size(); i ++) {

                System.out.println("País: " + nombresPaises.get(i + 1));
            }
        }
        else {
            for(int i = path.size() - 1; i >= 0; i --) {

                System.out.println("País: " + nombresPaises.get(i + 1));
            }
        }
    }
}
