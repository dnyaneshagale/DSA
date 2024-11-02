class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        
        int minDiff = Math.abs(arr[0]-arr[1]);

        for(int i = 1; i < arr.length-1; i++) {
            minDiff = Math.min(minDiff, Math.abs(arr[i] - arr[i+1]));
        }

        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < arr.length-1; i++) {
            if(Math.abs(arr[i] - arr[i+1]) == minDiff){
                List<Integer> list1 = new ArrayList<>();
                list1.add(arr[i]);
                list1.add(arr[i+1]);
                list.add(list1);
            }
        }

        return list;
    }
}