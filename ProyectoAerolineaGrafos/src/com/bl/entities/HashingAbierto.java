package com.bl.entities;

import com.bl.logic.AppController;

import java.util.ArrayList;

public class HashingAbierto {
    private Nodo[] tabla;
    private int cantidad;

    AppController appController = new AppController();


    // Constructor
    public HashingAbierto(int tableSize) {
        tabla = new Nodo[siguientePrimo(tableSize)];
        cantidad = 0;
    }

    // Verifica si la tabla hash esta vacia
    public boolean estaVacio() {
        return cantidad == 0;
    }

    // Vacia la tabla Hash
    public void vaciarTabla() {
        int l = tabla.length;
        tabla = new Nodo[l];
        cantidad = 0;
    }

    // Retorna la cantidad de elementos almacenados en la tabla hash
    public int getCantidad() {
        return cantidad;
    }


    // Inserta un elemento
    public void insertar(ArrayList<String> nombres) {

        int[] hash = new int[25];

        for (int j = 0; j < nombres.size(); j++) {

            if (nombres.get(j).length()>0) {
                hash[j] += nombres.get(j).charAt(0);
            }
            if (nombres.get(j).length()>1) {
                hash[j] += nombres.get(j).charAt(1);
            }
            if (nombres.get(j).length()>4) {
                hash[j] += nombres.get(j).charAt(4);
            }

            hash[j] = (hash[j]*hash[j]) - (nombres.get(j).length()*2);

            }

        for (int j = 0; j < nombres.size(); j++) {
            int pos = funcionHash(hash[j]);
            Nodo temp = new Nodo(hash[j]);
            if (tabla[pos] == null) {
                tabla[pos] = temp;
            } else {
                temp.siguiente = tabla[pos];
                tabla[pos] = temp;
            }
            cantidad++;
        }
    }

    // La funcion hash
    private int funcionHash(Integer x) {
        int valorHash = x % tabla.length;

        if (valorHash < 0) {
            valorHash += tabla.length;
        }

        return valorHash;
    }

    //Genera el siguiente numero primo dado un numero recibido
    private int siguientePrimo(int n) {
        if (n % 2 == 0) {
            n++;
        }

        for (; !esPrimo(n); n += 2);

        return n;
    }

    // Verifica que el numero recibido es primo
    private boolean esPrimo(int n) {
        if (n == 2 || n == 3) {
            return true;
        }

        if (n == 1 || n % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    //Muestra la tabla por pantalla
    public void mostrarTablaHash() {
        System.out.println();

        for (int i = 0; i < tabla.length; i++) {
            System.out.print("\t"+ i + (i < 10 ? " " : "") +"|__| -> ");
            Nodo start = tabla[i];

            while (start != null) {
                System.out.print(start.data);
                if(start.siguiente == null) {
                    System.out.print(" -> NULL");
                }else {
                    System.out.print(" -> ");
                }

                start = start.siguiente;
            }

            System.out.println();
        }
    }

    //Devuelve verdadero si existe el elemento en la tabla hash
    public boolean buscar(String valor) {
        int hash = 0;
        if (valor.length() > 0) {
            hash += valor.charAt(0);
        }
        if (valor.length() > 1) {
            hash += valor.charAt(1);
        }
        if (valor.length() > 4) {
            hash += valor.charAt(4);
        }

        hash = (hash * hash) - (valor.length() * 2);

        int pos = funcionHash(hash);
        Nodo temp = tabla[pos];

        //Se revisa si existen mas objetos en la lista enlazada
        while (temp != null) {
            if(temp.data == hash) {
                return true;
            }
            temp = temp.siguiente;
        }

        return false;
    }

}
