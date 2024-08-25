class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {        
        int i = 0;

        while(i < k){
            int x = Integer.MAX_VALUE;

            for(int j = 0; j < nums.length; j++) {
                if(nums[j] < x){
                    x = nums[j];
                }
            }

            for(int j = 0; j < nums.length; j++){
                if(nums[j] == x){
                    nums[j] = x*multiplier;
                    break;
                }
            }
            i++;
        }
        return nums;
    }
}