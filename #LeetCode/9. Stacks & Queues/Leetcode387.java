class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            q.add(i);

            freq[ch-'a']++;

            while (!q.isEmpty() && freq[s.charAt(q.peek()) - 'a'] > 1) {
                q.remove();
            }
        }
        if(q.isEmpty()){
            return -1;
        }
        
        return q.peek();
    }
}