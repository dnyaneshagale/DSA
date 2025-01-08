package Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class TopSort {
    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int s, int d, int w) {
            this.source = s;
            this.destination = d;
            this.weight = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
    
        // Adding directed edges as per the graph in the image
        graph[5].add(new Edge(5, 0, 1));
        graph[5].add(new Edge(5, 2, 1));
        graph[4].add(new Edge(4, 0, 1));
        graph[4].add(new Edge(4, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[3].add(new Edge(3, 1, 1));
    }
    
    public static void topSort(ArrayList<Edge> [] graph) {
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for(int i =0; i < graph.length; i++) {
            if(!visited[i]) {
                topSortUtil(graph, i, visited, s);;
            }
        }

        while(!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

    public static void topSortUtil(ArrayList<Edge> [] graph, int curr, boolean[] visited, Stack<Integer> s) {
        visited[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if(!visited[e.destination]) {
                topSortUtil(graph, e.destination, visited, s);
            }
        }
        s.push(curr);
    }

    public static void main(String[] args) {
        ArrayList<Edge> [] graph = new ArrayList[6];
        createGraph(graph);

        topSort(graph);
    }
}
