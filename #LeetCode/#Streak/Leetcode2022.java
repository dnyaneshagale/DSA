class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];
        } 

        int[][] ans = new int[m][n];

        int rows = 0;
        int cols = 0;
        int i = 0;


        while (i < original.length) {
            ans[rows][cols] = original[i];
            i++;
            cols++;
            
            if (cols == n) {
                cols = 0;
                rows++;
            }
        }
        return ans;
    }
}


/*
 class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];
        } 

        int[][] ans = new int[m][n];
        int index = 0; 
        
        for (int rows = 0; rows < m; rows++) {
            for (int cols = 0; cols < n; cols++) {
                ans[rows][cols] = original[index];
                index++;
            }
        }
        return ans;
    }
}
 */