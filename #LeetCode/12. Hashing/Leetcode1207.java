class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        HashSet<Integer> set = new HashSet<>();

        for(Integer key : map.keySet()) {
            set.add(map.get(key));
        }

        return map.size() == set.size();
    }
}