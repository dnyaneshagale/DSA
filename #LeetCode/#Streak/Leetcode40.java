class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> subsets = new ArrayList<>();
        Arrays.sort(candidates);  // Sort the array to handle duplicates
        generateSubsets(0, candidates, new ArrayList<>(), subsets, target);
        return subsets;
    }

    void generateSubsets(int start, int[] nums, List<Integer> current, List<List<Integer>> subsets, int target) {
        if (target == 0) {
            subsets.add(new ArrayList<>(current)); // Add a copy of the current list
            return; // Return to avoid further processing
        }
        
        for (int i = start; i < nums.length; i++) {
            // Skip duplicates
            if (i > start && nums[i] == nums[i - 1]) continue;
            
            // Stop if the current number exceeds the remaining target
            if (nums[i] > target) break;
            
            current.add(nums[i]);
            generateSubsets(i + 1, nums, current, subsets, target - nums[i]);
            current.remove(current.size() - 1); // Backtrack
        }
    }
}