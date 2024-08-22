class Solution {
    public int search(int[] nums, int target) {
        int si = 0;
        int ei = nums.length - 1;

        while(si <= ei) {
            int mid = ((si+ei)/2);
            if(nums[mid] > target) {
                ei = mid - 1;
            }else if(nums[mid] < target){
                si = mid + 1;
            }
            if(nums[mid] == target) return mid;
        }
        return -1;
    }
}