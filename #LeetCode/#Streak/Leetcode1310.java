class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        
        // Calculate the prefix XOR
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] ^ arr[i];
        }
        
        int[] result = new int[queries.length];
        
        // Process each query
        for (int i = 0; i < queries.length; i++) {
            int L = queries[i][0];
            int R = queries[i][1];
            if (L == 0) {
                result[i] = prefix[R];
            } else {
                result[i] = prefix[R] ^ prefix[L - 1];
            }
        }
        
        return result;
    }
}