class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        getAllSubsets(nums, result, new ArrayList<>(), 0);
        return result;
    }

    private void getAllSubsets(int[] nums, List<List<Integer>> result, List<Integer> subset, int index) {
        if (index > nums.length - 1) {
            result.add(new ArrayList<>(subset));
            return;
        }

        getAllSubsets(nums, result, subset, index + 1);
        subset.add(nums[index]);

        getAllSubsets(nums, result, subset, index + 1);
        subset.remove(subset.size() - 1);
    }
}