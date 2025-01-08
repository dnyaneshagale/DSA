package Graphs;

import java.util.ArrayList;

public class CycleDetection {
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

    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];

        for(int i = 0; i < graph.length; i++) {
            if(!vis[i]) {
                return detectCycleUtil(graph, i, -1, vis);
            }
        }

        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge> [] graph, int curr, int par, boolean[] visited) {
        visited[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if(visited[e.destination] && e.destination != par) {  // Case 1 : Visited my Neighbour, Not my parent
                return true;
            } 

            else if (!visited[e.destination]) {  // Case 2 : not visited neighbour But check if Cycle exists
                if(detectCycleUtil(graph, e.destination, curr, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Edge> [] graph = new ArrayList[5];
        createGraph(graph);

        /*  0-------1---------2
         *          |       /  
         *          |    /
         *          |  /     
         *          3 ---------4
         * 
         * 
         */

        System.out.println(detectCycle(graph));
        
    }
}
