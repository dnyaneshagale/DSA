class Solution {
    public void sortColors(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[j]>nums[i]){
                    swap(nums, i, j);
                }
            }
        }
    }
    public static void swap(int[] arr, int from, int to){
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
}