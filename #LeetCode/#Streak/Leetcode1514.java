class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        Map<Integer, List<Pair<Integer, Double>>> adj = new HashMap<>();
        double[] result = new double[n];
        
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            double prob = succProb[i];
            
            adj.computeIfAbsent(u, k -> new ArrayList<>()).add(new Pair<>(v, prob));
            adj.computeIfAbsent(v, k -> new ArrayList<>()).add(new Pair<>(u, prob));
        }
        
        PriorityQueue<Pair<Double, Integer>> pq = new PriorityQueue<>(Collections.reverseOrder((a, b) -> Double.compare(a.getKey(), b.getKey())));
        result[start] = 1.0;
        pq.offer(new Pair<>(1.0, start));
        
        while (!pq.isEmpty()) {
            Pair<Double, Integer> curr = pq.poll();
            int currNode = curr.getValue();
            double currProb = curr.getKey();
            
            if (currNode == end) return currProb;
            
            for (Pair<Integer, Double> temp : adj.getOrDefault(currNode, new ArrayList<>())) {
                int adjNode = temp.getKey();
                double adjProb = temp.getValue();
                
                if (result[adjNode] < currProb * adjProb) {
                    result[adjNode] = currProb * adjProb;
                    pq.offer(new Pair<>(result[adjNode], adjNode));
                }
            }
        }
        
        return 0.0;
    }
}