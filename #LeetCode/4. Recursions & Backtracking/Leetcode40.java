class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(candidates);

        getSubsets(0, candidates, ans, new ArrayList<>(), target);

        return ans;
    }

    private void getSubsets(int idx, int[] arr, List<List<Integer>> list, List<Integer> temp, int target) {
        if(target == 0) {
            list.add(new ArrayList<>(temp));
            return;
        }

        for(int i = idx; i < arr.length; i++) {

            if (i > idx && arr[i] == arr[i - 1]) continue;  // skip duplicates
            if (arr[i] > target) break;

            temp.add(arr[i]);
            getSubsets(i+1, arr, list, temp, target - arr[i]);
            temp.remove(temp.size() - 1);
        }
    }
}