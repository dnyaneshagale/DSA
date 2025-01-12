import java.util.*;

public class Kruskals {
    static class Edge implements Comparable<Edge> {
        int source;
        int destination;
        int weight;

        public Edge(int s, int d, int w) {
            this.source = s;
            this.destination = d;
            this.weight = w;
        }

        @Override
        public int compareTo(Edge e) {
            return this.weight - e.weight;
        }
    }  

    static void createGraph(ArrayList<Edge> graph) {
    
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));
    
        graph.add(new Edge(1, 3, 7));
        graph.add(new Edge(1, 2, 1));
    
        graph.add(new Edge(2, 4, 3));
    
        graph.add(new Edge(3, 5, 1));
    
        graph.add(new Edge(4, 3, 2));
        graph.add(new Edge(4, 5, 5));
    }

    static int n = 6; // Vertices
    static int[] par = new int[n];
    static int[] rank = new int[n];

    public static void init() {
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    public static int find (int x) {
        if (x == par[x]) {
            return x;
        }
        
        return par[x] = find(par[x]);
    }

    public static void union (int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (rank[parA] == rank[parB]) {
            par[parB] =parA;
            rank[parA]++;
        } else 
           if (rank[parA] < rank[parB]) {
            par[parA] = parB;
           }
        else {
            par[parB] = parA;
        }
    }

    public static void kruskalsMinSpanTree(ArrayList<Edge> edges, int V) {
        init();
        Collections.sort(edges);

        int mstCost = 0;


        for (int i = 0; i < V - 1; i++) {
            Edge e = edges.get(i);

            int parA = find(e.source);
            int parB = find(e.destination);

            if (parA != parB) {
                union(e.source, e.destination);
                mstCost += e.weight;
            }
        }
        System.out.println("MST Count : " + mstCost);
    }

    public static void main(String[] args) {
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);

        kruskalsMinSpanTree(edges, 6);
    }    
}
