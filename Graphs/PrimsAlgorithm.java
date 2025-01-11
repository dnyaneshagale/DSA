import java.util.*;

public class PrimsAlgorithm {
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

    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
    
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
    
        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));
    
        graph[2].add(new Edge(2, 4, 3));
    
        graph[3].add(new Edge(3, 5, 1));
    
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }
    
    static class Pair {
        int vtx;
        int pathWt;

        public Pair(int vtx, int pathWt) {
            this.vtx = vtx;
            this.pathWt = pathWt;
        }
    }
    public static void primsMST(ArrayList<Edge> [] graph) {
        boolean[] vis = new boolean[graph.length];

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {return a.pathWt - b.pathWt;});
        pq.add(new Pair(0, 0));
        int finalCost = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

            if(!vis[curr.vtx]) {
                vis[curr.vtx] = true;

                finalCost += curr.pathWt;

                for (int i = 0; i < graph[curr.vtx].size(); i++) {
                    Edge e = graph[curr.vtx].get(i);

                    pq.add(new Pair(e.destination, e.weight));
                }
            }
        }
        System.out.println("Final Cost of MST : " + finalCost);
    }

    public static void main(String[] args) {
        ArrayList<Edge> [] graph = new ArrayList[6];
        createGraph(graph);

        primsMST(graph);
    }    
}
