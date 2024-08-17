class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        int sp = 0;
        for(int ep = 0; ep < nums.length; ep++){
            sum += nums[ep];
            
            while(sum>=target){
                int len = ep - sp + 1;
                if(len < minLen){
                    minLen = len;
                }
                sum = sum - nums[sp];
                sp++;
            } 
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}