class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(pq.size() < k) {
                    pq.add(matrix[i][j]);
                }else{
                    if(pq.peek() > matrix[i][j]){
                        pq.poll();
                        pq.add(matrix[i][j]);
                    }
                }
            }
        }
        return pq.poll();
    }

/*
 class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        
        int[] ans = new int[n * n];

        int l = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                ans[l] = matrix[i][j];
                l++;
            }
        }
        Arrays.sort(ans);
        
        return ans[k-1];
    }
}
 */
}