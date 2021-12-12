package com.bl.logic;

import com.bl.entities.Dijkstra;
import com.bl.entities.Grafo;
import com.bl.entities.HashingAbierto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AppController {

    Grafo t = new Grafo();

    int graph[][] = new int[][]{
            {0, 100, 150, 300, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {100, 0, 125, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {150, 125, 0, 150, 200, 0, 0, 0, 0, 1500, 0, 2000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {300, 100, 150, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 200, 100, 0, 50, 100, 350, 400, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 50, 0, 25, 200, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 100, 25, 0, 100, 250, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 350, 200, 100, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 700, 0, 550},
            {0, 0, 0, 0, 400, 0, 250, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1500, 0, 0, 0, 0, 0, 0, 0, 50, 100, 75, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 250},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 50, 0, 0, 25, 60, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 300},
            {0, 0, 2000, 0, 0, 0, 0, 0, 0, 100, 0, 0, 50, 0, 0, 125, 375, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 75, 25, 50, 0, 30, 30, 125, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 60, 0, 30, 0, 25, 0, 0, 150, 0, 0, 0, 0, 0, 0, 400},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 30, 25, 0, 150, 0, 200, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 125, 0, 0, 150, 0, 200, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 375, 0, 0, 0, 200, 0, 400, 900, 800, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 150, 200, 0, 400, 0, 300, 0, 0, 0, 0, 250, 150},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 900, 300, 0, 200, 0, 250, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 800, 0, 200, 0, 150, 230, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 150, 0, 300, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 250, 230, 300, 0, 0, 500, 0},
            {0, 0, 0, 0, 0, 0, 0, 700, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 275},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 250, 0, 0, 0, 500, 100, 0, 200},
            {0, 0, 0, 0, 0, 0, 0, 550, 0, 250, 300, 0, 0, 400, 0, 0, 0, 150, 0, 0, 0, 0, 275, 200, 0}
    };

        public ArrayList<String> nombres = new ArrayList<>(); {{
        nombres.add("Canadá");
        nombres.add("Los Angeles");
        nombres.add("New York");
        nombres.add("México");
        nombres.add("Costa Rica");
        nombres.add("Colombia");
        nombres.add("Perú");
        nombres.add("Brasil");
        nombres.add("Argentina");
        nombres.add("Portugal");
        nombres.add("España");
        nombres.add("Inglaterra");
        nombres.add("Francia");
        nombres.add("Italia");
        nombres.add("Alemania");
        nombres.add("Suecia");
        nombres.add("Rusia");
        nombres.add("Egipto");
        nombres.add("India");
        nombres.add("China");
        nombres.add("Japón");
        nombres.add("Australia");
        nombres.add("Sudáfrica");
        nombres.add("Madagascar");
        nombres.add("Nigeria");
    }}


    public int convertirString(String value) {



        int data = 0;

        for (int j = 0; j < nombres.size(); j++) {

            if (nombres.get(j) == value) {
                data = j;
            }
        }
        return data;
    }


    public ArrayList<String> buscarVecinos(String value) {

        int pais = convertirString(value);

       return  t.verticesAdyacentes(graph, pais, nombres);

    }

    public boolean tablaHash (String pais){

        HashingAbierto th = new HashingAbierto(25);
        th.insertar(nombres);
        //th.mostrarTablaHash();
        //System.out.println("Existe el valor " + pais + ": " + th.buscar(pais));
        return th.buscar(pais);
    }

    public ArrayList<String> mostrarNombresCaminoCorto(Set<Integer> path, ArrayList<String> nombresPaises, int origen, int destino) {

        ArrayList<String> nombresPaisesRuta = new ArrayList<>();
        ArrayList<Integer> verticesCamino = new ArrayList<>(path);
        if(origen < destino) {

            for(int i = 0; i < path.size(); i ++) {

                int index = verticesCamino.get(i);
                nombresPaisesRuta.add(nombresPaises.get(index - 1));
            }
        }
        else {
            for(int i = path.size() - 1; i >= 0; i --) {

                int index = verticesCamino.get(i);
                nombresPaisesRuta.add(nombresPaises.get(index - 1));
            }
        }
        return nombresPaisesRuta;
    }

    Dijkstra dijkstra = new Dijkstra();

    public ArrayList<String> mostrarDijsktra(String Destino, String Origen){

        int src = convertirString(Origen);
        int dest = convertirString(Destino);

        //int src = 9 - 1, dest = 17 - 1;

        dijkstra.shortestPath(graph,src,dest);
        System.out.print("Camino más corto: ");
        System.out.println(dijkstra.path);
        return mostrarNombresCaminoCorto(dijkstra.path, nombres, src, dest);

        //find2ndShortest(adjacencyMatrix,src,dest);
    }

    public int PesoDijsktra () {

        List<Integer> list = new ArrayList<Integer>(dijkstra.allDists);
        int peso =  list.get(0);
        return  peso;
    }
}