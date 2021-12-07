package com.bl.entities;

import static com.bl.entities.Nodo.V;
import static com.bl.entities.Nodo.getV;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Grafo {

    private static final int NO_PARENT = -1;

    int minDistance(int dist[], Boolean sptSet[])
    {
        // dist es el valor maximo y sptset siempre es false al principio
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }

        return min_index;
    }


    //////// Alina


    public boolean existeArista(int graph[][], int v1, int v2) {
        if (v1 >= V || v2 >= V) {
            throw new ArrayIndexOutOfBoundsException(
                    "Vertices inválidos, fuera de rango" + "nRango de vertices: 0 - " + (getV() - 1));
        } else if (graph[v1][v2] != 0) {
            return true;
        }
        return false;
    }


    public void imprimirGrafo(int[][] grafo) {

        for(int Linea = 0; Linea < V; ++Linea) {
            for(int Columna = 0; Columna < grafo.length; ++Columna) {
                System.out.print(grafo[Linea][Columna] + " ");
                if (Columna + 1 == grafo.length) {
                    System.out.print("|| ");
                }
            }
            System.out.println("");
        }

        System.out.println("");
    }


    //Función vecinos
    public void verticesAdyacentes(int[][] grafo, int vertice) {

        ArrayList<Integer> listaAdyacencia = new ArrayList<Integer>();
        Nodo nombre = new Nodo();
        String[] nombr = nombre.getNombres();
        System.out.println("Vértice adyancente de " + nombr[vertice]);
        int cont = 0;
        for (int Linea = 0; Linea < V; ++Linea) {
            for (int Columna = 0; Columna < grafo.length; ++Columna) {
                if (Linea == vertice) {
                    if (grafo[vertice][Columna] != grafo[vertice][0]) {
                        listaAdyacencia.add(Columna);
                        System.out.println(" " + nombr[listaAdyacencia.get(cont)]);
                        cont++;
                    }
                }
            }
        }
    }
    /*

    public static void dijkstra(int[][] adjacencyMatrix, int startVertex)
    {
        int nVertices = adjacencyMatrix[0].length;

        // shortestDistances[i] will hold the
        // shortest distance from src to i
        int[] shortestDistances = new int[nVertices];

        // added[i] will true if vertex i is
        // included / in shortest path tree
        // or shortest distance from src to
        // i is finalized
        boolean[] added = new boolean[nVertices];

        // Initialize all distances as
        // INFINITE and added[] as false
        for (int vertexIndex = 0; vertexIndex < nVertices;
             vertexIndex++)
        {
            shortestDistances[vertexIndex] = Integer.MAX_VALUE;
            added[vertexIndex] = false;
        }

        // Distance of source vertex from
        // itself is always 0
        shortestDistances[startVertex] = 0;

        // Parent array to store shortest
        // path tree
        int[] parents = new int[nVertices];

        // The starting vertex does not
        // have a parent
        parents[startVertex] = NO_PARENT;

        // Find shortest path for all
        // vertices
        for (int i = 1; i < nVertices; i++)
        {

            // Pick the minimum distance vertex
            // from the set of vertices not yet
            // processed. nearestVertex is
            // always equal to startNode in
            // first iteration.
            int nearestVertex = -1;
            int shortestDistance = Integer.MAX_VALUE;
            for (int vertexIndex = 0;
                 vertexIndex < nVertices;
                 vertexIndex++)
            {
                if (!added[vertexIndex] &&
                        shortestDistances[vertexIndex] <
                                shortestDistance)
                {
                    nearestVertex = vertexIndex;
                    shortestDistance = shortestDistances[vertexIndex];
                }
            }

            // Mark the picked vertex as
            // processed
            added[nearestVertex] = true;

            // Update dist value of the
            // adjacent vertices of the
            // picked vertex.
            for (int vertexIndex = 0;
                 vertexIndex < nVertices;
                 vertexIndex++)
            {
                int edgeDistance = adjacencyMatrix[nearestVertex][vertexIndex];

                if (edgeDistance > 0
                        && ((shortestDistance + edgeDistance) <
                        shortestDistances[vertexIndex]))
                {
                    parents[vertexIndex] = nearestVertex;
                    shortestDistances[vertexIndex] = shortestDistance +
                            edgeDistance;
                }
            }
        }

        printSolution(startVertex, shortestDistances, parents);
    }

    // A utility function to print
    // the constructed distances
    // array and shortest paths
    private static void printSolution(int startVertex,
                                      int[] distances,
                                      int[] parents)
    {
        int nVertices = distances.length;
        System.out.print("Vertex\t Distance\tPath");

        for (int vertexIndex = 0;
             vertexIndex < nVertices;
             vertexIndex++)
        {
            if (vertexIndex != startVertex)
            {
                System.out.print("\n" + startVertex + " -> ");
                System.out.print(vertexIndex + " \t\t ");
                System.out.print(distances[vertexIndex] + "\t\t");
                printPath(vertexIndex, parents);
            }
        }
    }

    // Function to print shortest path
    // from source to currentVertex
    // using parents array
    private static void printPath(int currentVertex,
                                  int[] parents)
    {

        // Base case : Source node has
        // been processed
        if (currentVertex == NO_PARENT)
        {
            return;
        }
        printPath(parents[currentVertex], parents);
        System.out.print(currentVertex + " ");
    }
    /*

    public static boolean isReachable(int [][] graph, int src, int dest)
    {
        // get the total number of nodes in the graph
        int n = V;

        // to keep track of whether a vertex is discovered or not
        boolean[] discovered = new boolean[n];

        // create a queue for doing BFS
        Queue<Integer> q = new ArrayDeque<>();

        // mark the source vertex as discovered
        discovered[src] = true;

        // enqueue source vertex
        q.add(src);

        // loop till queue is empty
        while (!q.isEmpty())
        {
            // dequeue front node and print it
            int v = q.poll();

            // if destination vertex is found
            if (v == dest) {
                return true;
            }

            // do for every edge (v, u)
            for (int u: graph.adjList.get(v))
            {
                if (!discovered[u])
                {
                    // mark it as discovered and enqueue it
                    discovered[u] = true;
                    q.add(u);
                }
            }
        }

        return false;
    }

    */




    /////////Alina/////////////////////////////////////////////////////////////////////////////////////////////

    // A utility function to print the constructed distance array
    void printSolution(int dist[],int origen, int destino)
    {

        System.out.println("Origen   Destino Distancia");
       /* for (int i = 0; i < V; i++){
            System.out.println(i + " \t\t " + dist[i]);
    */
       Nodo nombre = new Nodo();
       String[] nombr = nombre.getNombres();
        System.out.println(nombr[origen] + "  " + nombr[destino-1] + " " + dist[destino-1]);
        System.out.println(origen+1 + " \t\t " + destino + " \t\t " + dist[destino-1]);

        /*for (int i = 0; i < V; i++)
            System.out.println(i + " \t\t " + dist[i]);
            System.out.println(nombr);
*/

    }

    /*void printSolution(int dist[])
    {
        System.out.println("Vertex \t\t Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i + " \t\t " + dist[i]);
    }*/


    public void dijkstra(int graph[][], int origen, int destino)
    {
        int dist[] = new int[V];
        Boolean sptSet[] = new Boolean[V];

        // se inicializan ambos arrays con el valor maximo y valor false
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        dist[origen] = 0;

        //itera el numero
        for (int count = origen; count < destino- 1; count++) {
            // la primera vez que corre siempre va a devolver un 0
            int u = minDistance(dist, sptSet);

            sptSet[u] = true;

            for (int v = 0; v < destino; v++)

                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }

        // print the constructed distance array
        printSolution(dist,origen,destino);
    }
}

    /*public void dijkstra(int graph[][], int src)
    {
        int dist[] = new int[V]; // The output array. dist[i] will hold
        // the shortest distance from src to i

        // sptSet[i] will true if vertex i is included in shortest
        // path tree or shortest distance from src to i is finalized
        Boolean sptSet[] = new Boolean[V];

        // Initialize all distances as INFINITE and stpSet[] as false
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        // Distance of source vertex from itself is always 0
        dist[src] = 0;

        // Find shortest path for all vertices
        for (int count = 0; count < V - 1; count++) {
            // Pick the minimum distance vertex from the set of vertices
            // not yet processed. u is always equal to src in first
            // iteration.
            int u = minDistance(dist, sptSet);

            // Mark the picked vertex as processed
            sptSet[u] = true;

            // Update dist value of the adjacent vertices of the
            // picked vertex.
            for (int v = 0; v < V; v++)

                // Update dist[v] only if is not in sptSet, there is an
                // edge from u to v, and total weight of path from src to
                // v through u is smaller than current value of dist[v]
                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }

        // print the constructed distance array
        printSolution(dist);
    }*/
