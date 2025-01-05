class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for(int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])) {
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        
        int[] ans = new int[list.size()];
        int i = 0;
        for(Integer val : list) {
            ans[i] = val;
            i++;
        }
        return ans;
    }
}