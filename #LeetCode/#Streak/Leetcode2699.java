class Solution {
    private static final int INF = (int) 2e9;

    public int[][] modifiedGraphEdges(int n, int[][] edges, int src, int dst, int target) {
        long curDist = dijkstra(edges, n, src, dst);

        if (curDist < target) return new int[0][0];

        boolean match = curDist == target;

        for (int[] e : edges) {
            if (e[2] > 0) continue;
            e[2] = match ? INF : 1;

            if (!match) {
                long newDist = dijkstra(edges, n, src, dst);
                if (newDist <= target) {
                    match = true;
                    e[2] += target - newDist;
                }
            }
        }

        return match ? edges : new int[0][0];
    }

    private long dijkstra(int[][] edges, int n, int src, int dst) {
        long[][] adj = new long[n][n];
        long[] dist = new long[n];
        boolean[] vis = new boolean[n];

        Arrays.fill(dist, INF);
        for (long[] row : adj) Arrays.fill(row, INF);
        dist[src] = 0;

        for (int[] e : edges) {
            if (e[2] != -1) {
                adj[e[0]][e[1]] = e[2];
                adj[e[1]][e[0]] = e[2];
            }
        }

        for (int i = 0; i < n; i++) {
            int u = -1;
            for (int j = 0; j < n; j++) {
                if (!vis[j] && (u == -1 || dist[j] < dist[u])) u = j;
            }
            vis[u] = true;

            for (int v = 0; v < n; v++) {
                dist[v] = Math.min(dist[v], dist[u] + adj[u][v]);
            }
        }

        return dist[dst];
    }
}
