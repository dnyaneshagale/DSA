class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        Deque<Integer> deque = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(!deque.isEmpty() && deque.getFirst() <= i - k){
                deque.removeFirst();
            }

            while(!deque.isEmpty() && arr[deque.getLast()] <= arr[i]){
                deque.removeLast();
            }

            deque.addLast(i);

            if(i >= k - 1){
                list.add(arr[deque.getFirst()]);
            }
        }
        
        int[] ans = new int[list.size()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}