class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int N = m+n;
        int [] ans = new int[N];

        int si = 0;
        for(int k = 0; k < m; k++){
            ans[si]=nums1[k];
            si++;
        }

        for(int i = 0; i < n; i++){
            ans[si]=nums2[i];
            si++;
        }

        for(int i = 0; i < ans.length -1 ; i++){
            for(int j = 0; j < ans.length - 1 ; j++){
                if(ans[j+1]<ans[j]){
                    int temp = ans[j];
                    ans[j] = ans[j+1];
                    ans[j+1] = temp; 
                }
            }
        }
        for(int i = 0; i < N; i++){
            nums1[i] = ans[i];
        }
    }
}