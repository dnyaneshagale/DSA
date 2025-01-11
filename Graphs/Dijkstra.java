import java.util.*;

public class Dijkstra {
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
        int node;
        int pathWt;

        public Pair(int node, int pathWt) {
            this.node = node;
            this.pathWt = pathWt;
        }
    }
    public static int[] dijkstra(ArrayList<Edge> [] graph, int src) {
        int[] dist = new int[graph.length];

        for(int i = 0; i < graph.length; i++) {
            if(i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        boolean[] visited = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {return a.pathWt - b.pathWt;});
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

            if(!visited[curr.node]) {
                visited[curr.node] = true;

                for(int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);

                    int u = e.source;
                    int v = e.destination;
                    int wt = e.weight;

                    if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;

                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        ArrayList<Edge> [] graph = new ArrayList[6];
        createGraph(graph);

        int[] dijkstra = dijkstra(graph, 0);
        for(int i : dijkstra) {
            System.out.print(i + " ");
        }
    }    
}
