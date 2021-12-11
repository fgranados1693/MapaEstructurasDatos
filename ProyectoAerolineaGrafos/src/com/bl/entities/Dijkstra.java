package com.bl.entities;
import java.util.*;

public class Dijkstra {
    public static final int NO_PARENT = -1;
    public static Set<Integer> path = new LinkedHashSet<>(); //nodes in the shortest path
    public static Set<Integer> allDists = new TreeSet<>(); //list of shortest distance, sorted

    //use Dijkstra’s Shortest Path Algorithm, O(n^2) Space O(n)
    public static void shortestPath(int[][] adjacencyMatrix,  int src, int dest) {
        int n = adjacencyMatrix[0].length;
        int[] shortest = new int[n];
        boolean[] visited = new boolean[n];
        int[] parents = new int[n];
        for (int v = 0; v < n; v++)  {
            shortest[v] = Integer.MAX_VALUE;
            visited[v] = false;
        }
        shortest[src] = 0;
        parents[src] = NO_PARENT;
        for (int i = 1; i < n; i++)  {
            int pre = -1;
            int min = Integer.MAX_VALUE;
            for (int v = 0;  v < n;  v++) {
                if (!visited[v] && shortest[v] < min) {
                    pre = v;
                    min = shortest[v];
                }
            }
            if(pre==-1)
                return;
            visited[pre] = true;
            for (int v = 0; v < n; v++)  {
                int dist = adjacencyMatrix[pre][v];
                if (dist > 0 && ((min + dist) < shortest[v]))  {
                    parents[v] = pre;
                    shortest[v] = min + dist;
                }
            }
        }
        allDists.add(shortest[dest]);
        addPath(dest, parents);
    }

    //utility func to add nodes in the path recursively
    static void addPath(int i,int[] parents)  {
        if (i == NO_PARENT)
            return;
        addPath(parents[i], parents);
        path.add(i + 1);
    }

    //get 2nd shortest by removing each edge in shortest and compare
    static void find2ndShortest(int[][] adjacencyMatrix,int src, int dest) {
        int preV = -1, preS = -1, preD = -1; //store previous vertex's data
        List<Integer> list = new ArrayList<Integer>(path);
        for (int i = 0; i < list.size()-1 ; i++) {
            //get source and destination for each path in shortest path
            int s = list.get(i);
            int d = list.get(i + 1);
            if (preV != -1) {//resume the previous path
                adjacencyMatrix[preS][preD] = preV;
                adjacencyMatrix[preD][preS] = preV;
            }
            //record the previous data for recovery
            preV = adjacencyMatrix[s][d];
            preS = s;
            preD = d;
            //remove this path
            adjacencyMatrix[s][d] = 0;
            adjacencyMatrix[d][s] = 0;
            //re-calculate
            shortestPath(adjacencyMatrix, src , dest);
        }
    }


}
