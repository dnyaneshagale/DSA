class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int k = n-1;

        //null checks
        if(nums.length == 0 || nums == null) return;

        //find k
        for(int i = n-1; i > 0; i--){
            if(nums[i]<=nums[i-1]){
                k--;
            }else{
                break;
            }
        }

        //k=>-1
        if(k==-1){
            reverse(nums, 0, n-1);
            return;
        }

        //replace k with next greater element reverse
        for(int i = n-1; i > 0; i--){
            if(nums[i]>nums[k]){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                break;
            }
        }        
        reverse(nums, k+1, n-1);
    }

    void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}