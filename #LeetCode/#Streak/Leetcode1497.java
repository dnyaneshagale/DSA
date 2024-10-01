class Solution {
    public boolean canArrange(int[] arr, int k) {
        // Array to keep track of frequency of remainders
        int[] remainderCount = new int[k];
        
        // Fill the remainderCount array with the frequencies of each remainder
        for (int num : arr) {
            int remainder = (num % k + k) % k; // This ensures positive remainder
            remainderCount[remainder]++;
        }
        
        // Check if the remainders can be paired properly
        for (int i = 1; i < k; i++) {
            // remainder i should have the same count as remainder k - i
            if (remainderCount[i] != remainderCount[k - i]) {
                return false;
            }
        }
        
        // Special case for remainder 0: it must have an even count because they pair with themselves
        return remainderCount[0] % 2 == 0;
    }
}



// class Solution {
//     public boolean canArrange(int[] arr, int k) {
//         int l = arr.length;
//         int m = l/2;
//         int n = l/2;
        

//         if(l%2 != 0) return false;
        
//         int hi = arr[0] + arr[l-1];
        
//         if(hi % k != 0){
//             return false;
//         }

//         int[] arr2 = new int[n];
//         int[] arr1 = new int[m];

//         int j = 0;
//         int p = 0;

//         for (int i = 0; i < l; i++) {
//             if (i < m) {
//                 arr1[j] = arr[i];
//                 j++;
//             } else {
//                 arr2[p] = arr[i];
//                 p++;
//             }
//         }


//         int r = 0;
//         while(n > 0){
//             int i = 0;
//             arr[n-1-r] = arr[i];
//             n--;
//             i++;
//         }

//         for (int i = 0; i < n; i++) {
//             int arrSum = arr1[i] + arr2[i];
            
//             if (arrSum % k != 0) {
//                 return false;
//             }
//         }
        
//         return true;
//     }
// }