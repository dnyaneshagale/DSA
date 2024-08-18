class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                int a = nums[i];
                int b = nums[j];
                if(a + b == target){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }
}