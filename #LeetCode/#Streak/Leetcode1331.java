class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) return new int[0];
        
        // Create a copy of the array to sort
        int[] temp = Arrays.copyOf(arr, arr.length);
        
        // Sort the temp array
        Arrays.sort(temp);
        
        // Map to store the rank of each element
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        // Assign ranks to elements (without duplicates)
        for (int val : temp) {
            if (!rankMap.containsKey(val)) {
                rankMap.put(val, rank);
                rank++;
            }
        }

        // Create the result array
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }

        return result;
    }
}
