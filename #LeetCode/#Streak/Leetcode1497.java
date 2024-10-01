class Solution {
    public boolean canArrange(int[] arr, int k) {
        int l = arr.length;
        int m = l/2;
        int n = l/2;
        

        if(l%2 != 0) return false;
        
        int hi = arr[0] + arr[l-1];
        
        if(hi % k != 0){
            return false;
        }

        int[] arr2 = new int[n];
        int[] arr1 = new int[m];

        int j = 0;
        int p = 0;

        for (int i = 0; i < l; i++) {
            if (i < m) {
                arr1[j] = arr[i];
                j++;
            } else {
                arr2[p] = arr[i];
                p++;
            }
        }


        int r = 0;
        while(n > 0){
            int i = 0;
            arr[n-1-r] = arr[i];
            n--;
            i++;
        }

        for (int i = 0; i < n; i++) {
            int arrSum = arr1[i] + arr2[i];
            
            if (arrSum % k != 0) {
                return false;
            }
        }
        
        return true;
    }
}