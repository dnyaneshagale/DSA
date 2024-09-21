class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            dfs(i, n, res);
        }
        return res;
    }
    
    private void dfs(int curr, int n, List<Integer> res) {
        if (curr > n) return;
        res.add(curr);
        for (int i = 0; i < 10; i++) {
            if (curr * 10 + i > n) return;
            dfs(curr * 10 + i, n, res);
        }
    }
}