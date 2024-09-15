class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0, maxLen = 0, count = 0;
        
        //The maximum element in the array
        for (int num : nums) {
            if (num > max) max = num;
        }
        
        //longest subarray with elements equal to max
        for (int num : nums) {
            if (num == max) {
                count++;
            } else {
                maxLen = Math.max(maxLen, count);
                count = 0;
            }
        }
        
        return Math.max(maxLen, count);
    }
}