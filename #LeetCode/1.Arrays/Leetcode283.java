class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j =0;

        //0 to j-1 => non zeros
        //j to i-1 => zero
        //i to end => unknown

        while(i < nums.length) {
            if(nums[i] == 0) {
                i++;
            } else {
                swap(nums, i, j);
                i++;
                j++;
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}