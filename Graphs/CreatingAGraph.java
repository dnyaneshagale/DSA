package Graphs;

import java.util.*;

public class CreatingAGraph {
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

    public static void main(String[] args) {
        
        /*                 2
         *         (1) ----------- (2)
         *                         |    \
         *                       4 |      \ 5
         *                         |        \
         *                        (3)--------(4)
         *                                3   |
         *                                    |1
         *                                    |
         *                                   (5)
         */

        ArrayList<Edge> [] graph = new ArrayList[5];

        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Vertex 1
        graph[0].add(new Edge(1, 2, 2));

        // Vertex 2
        graph[1].add(new Edge(2, 1, 2));
        graph[1].add(new Edge(2, 3, 4));
        graph[1].add(new Edge(2, 4, 5));

        // Vertex 3
        graph[2].add(new Edge(3, 2, 4));
        graph[2].add(new Edge(3, 4, 3));

        // Vertex 4
        graph[3].add(new Edge(4, 2, 5));
        graph[3].add(new Edge(4, 3, 3));
        graph[3].add(new Edge(4, 5, 1));

        // Vertex 5
        graph[4].add(new Edge(5, 4, 1));


        // Printing Neighbours
        for(int i = 0; i < graph[3].size(); i++) {
            System.out.println(graph[3].get(i).destination);
        }
    }
}
