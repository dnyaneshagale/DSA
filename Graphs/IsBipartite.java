package Graphs;
import java.util.*;

public class IsBipartite {
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
    
        // Adding edges for a bipartite graph
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 3, 1));
        
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 2, 1));
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph) {

        int [] color = new int[graph.length];   // 1 = Red , 0 = Blue

        for(int i = 0; i < graph.length; i++) {
            color[i] = -1; //No Color
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < graph.length; i++) {
            if(color[i] == -1) {
                q.add(i);
                color[i] = 0;

                while (!q.isEmpty()) {
                    int curr = q.remove();

                    for(int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);

                        if(color[e.destination]==-1) {
                            int nextColor = color[curr] == 0 ? 1 : 0;
                            color[e.destination] = nextColor;
                            q.add(e.destination);
                        } 
                        else if (color[e.destination] == color[curr]) {
                            return false;       // Not a Partite Graph
                        }
                    }
                }
            }
        } 
        return true;   // It is a Partite Graph
    }
    public static void main(String[] args) {
        
        /*                  1
         *         (0) ----------- (1)
         *          |               |     
         *        1 |               | 1    
         *          |               |        
         *         (4) ----------- (2)
         *                  1              
         *                                   
         */

        ArrayList<Edge> [] graph = new ArrayList[5];
        createGraph(graph);

        // Acyclic Graph is Always BIPARTITE
        // Even Cyclic is Always BIPARTITE
        // Odd Cyclic is NOT BIPARTITE
        
        System.out.println(isBipartite(graph));

    }
}

