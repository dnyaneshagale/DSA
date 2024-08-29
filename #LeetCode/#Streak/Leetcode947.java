public class Solution {
    public int removeStones(int[][] stones) {
        int n = stones.length;
        boolean[] visited = new boolean[n];
        Map<Integer, List<Integer>> rowMap = new HashMap<>();
        Map<Integer, List<Integer>> colMap = new HashMap<>();
        
        // Build the hash maps for rows and columns
        for (int i = 0; i < n; i++) {
            int x = stones[i][0];
            int y = stones[i][1];
            
            rowMap.computeIfAbsent(x, k -> new ArrayList<>()).add(i);
            colMap.computeIfAbsent(y, k -> new ArrayList<>()).add(i);
        }
        
        int components = 0;
        
        // DFS to count connected components
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, stones, rowMap, colMap, visited);
                components++;
            }
        }
        
        return n - components;
    }
    
    private void dfs(int node, int[][] stones, Map<Integer, List<Integer>> rowMap, Map<Integer, List<Integer>> colMap, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(node);
        visited[node] = true;
        
        while (!stack.isEmpty()) {
            int current = stack.pop();
            int x = stones[current][0];
            int y = stones[current][1];
            
            // Visit all stones in the same row
            for (int neighbor : rowMap.get(x)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
            
            // Visit all stones in the same column
            for (int neighbor : colMap.get(y)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }
    }
}