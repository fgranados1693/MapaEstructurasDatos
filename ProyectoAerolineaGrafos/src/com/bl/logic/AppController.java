package com.bl.logic;

import com.bl.entities.Grafo;

import java.util.ArrayList;

public class AppController {

    Grafo t = new Grafo();
    //HashingAbierto th = new HashingAbierto(25);

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

   /* public void tablaHash (){
        String key = "Costa Rica";
        th.insertar(nombres);
        th.mostrarTablaHash();

        System.out.println("Existe el valor " + key + ": " + th.buscar(key));
    }*/


}