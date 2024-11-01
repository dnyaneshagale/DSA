class Solution {
    public int strangePrinter(String s) {
        char[] sc = s.toCharArray();
        final int n = removeDuplicates(sc);
        if(n <= 1)return n;
        return dfs(0, n-1, sc, new int[n][n]);
    }

    private int dfs(int left, int right, char[] sc, int[][] memo){
        if(left >= right) {
            return (left == right) ? 1 : 0;
        }

        if(memo[left][right] != 0){
            return memo[left][right];
        }
        int letter = sc[left];
        int answer = 1 + dfs(left+1, right, sc, memo);

        for(int k = left + 1; k <= right; k++) {
            if(sc[k] == letter) {
                answer = Math.min(answer, dfs(left+1, k-1, sc, memo) + dfs(k, right, sc, memo));
            }
        }
        return memo[left][right] = answer;
    }
    private int removeDuplicates(char[] sc){
        int idx = 0;
        char prev = 0;

        for(char c : sc) {
            if(c != prev) {
                sc[idx++] = c;
                prev = c;
            }
        }
        return idx;
    }
}