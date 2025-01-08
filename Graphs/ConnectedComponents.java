package Graphs;

import java.util.*;


public class ConnectedComponents {
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
    
        // Adding edges
        graph[0].add(new Edge(0, 1, 2));
        
        graph[1].add(new Edge(1, 2, 4)); 
        graph[1].add(new Edge(1, 0, 2));
        graph[1].add(new Edge(1, 3, 5)); 
        
        graph[2].add(new Edge(2, 1, 4));
        graph[2].add(new Edge(2, 3, 3));
    
        graph[3].add(new Edge(3, 1, 5));
        graph[3].add(new Edge(3, 2, 3));
        graph[3].add(new Edge(3, 4, 1));

        graph[4].add(new Edge(4, 3, 1));
    }
    
    public static void bfs(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]) {
                bfsUtil(graph, visited);
            }
        }
    }

    public static void bfsUtil (ArrayList<Edge>[] graph, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);

        while(!q.isEmpty()) {
            int curr = q.remove();

            if(!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;

                for(int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    if (!visited[e.destination]) {
                        q.add(e.destination);
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Edge> [] graph = new ArrayList[5];
        createGraph(graph);

        bfs(graph);
    }
}

