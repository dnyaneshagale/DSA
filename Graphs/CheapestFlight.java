import java.util.*;
import java.util.LinkedList;

public class CheapestFlight {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge (int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static class Info {
        int vtx;
        int cost;
        int stops;

        public Info (int vtx, int cost, int stops) {
            this.vtx = vtx;
            this.cost = cost;
            this.stops = stops;
        }
    }

    public static void createGraph(int[][] flights, ArrayList<Edge> [] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < flights.length; i++) {
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];

            graph[src].add(new Edge(src, dest, wt));
        }
    }

    public static int findCheapestPrice(int n, int[][] flights, int src, int dest, int k) {
        ArrayList<Edge> [] graph = new ArrayList[n];
        createGraph(flights, graph);

        int[] dist = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();

            if(curr.stops > k) {
                break;
            }

            for (int i = 0; i < graph[curr.vtx].size(); i++) {
                Edge e = graph[curr.vtx].get(i);
                //int u = e.src; // Not Required
                int v = e.dest;
                int wt = e.wt;

                if (curr.cost + wt < dist[v] && curr.stops <= k) {
                    dist[v] = curr.cost + wt;

                    q.add(new Info(v, dist[v], curr.stops+1));
                }
            }
        }

        return dist[dest] == Integer.MAX_VALUE ? -1 : dist[dest];
    }

    public static void main(String[] args) {
        int[][] flights = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        
        int cp = findCheapestPrice(4, flights, 0, 3, 1);

        System.out.println("Cheapest Price Will Be : " + cp);
    }
}
