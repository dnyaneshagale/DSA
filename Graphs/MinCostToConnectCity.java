
class Solution {
    static class Edge {
        int src;
        int dest;
        int wt;

        // Constructor
        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    
    public void createGraph(int[][] houses, ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
    
        for (int i = 0; i < houses.length; i++) {
            int u = houses[i][0];
            int v = houses[i][1];
        
            for (int j = i + 1; j < houses.length; j++) {
                int x = houses[j][0];
                int y = houses[j][1];
                int dist = Math.abs(u - x) + Math.abs(v - y); // Manhattan distance
                
                // Add an edge in both directions for an undirected graph
                graph[i].add(new Edge(i, j, dist));
                graph[j].add(new Edge(j, i, dist));
            }
        }
    }

    public int minCostCity(int[][] houses, int n) {
        boolean[] vis = new boolean[n];
        ArrayList<Edge>[] graph = new ArrayList[n];
        createGraph(houses, graph);

        PriorityQueue<Edge> pq = new PriorityQueue<>((a, b) -> a.wt - b.wt);
        pq.add(new Edge(0, 0, 0)); // Start from node 0
        
        int minCost = 0;

        while (!pq.isEmpty()) {
            Edge curr = pq.remove();
            
            if (!vis[curr.dest]) {
                vis[curr.dest] = true;
                minCost += curr.wt;
                
                for (Edge e : graph[curr.dest]) {
                    if (!vis[e.dest]) {
                        pq.add(e);
                    }
                }
            }
        }
        return minCost;
    }
}
