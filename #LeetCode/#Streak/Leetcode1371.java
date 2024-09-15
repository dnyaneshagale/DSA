class Solution {
    public int findTheLongestSubstring(String s) {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, -1);
        int st = 0, res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a') st ^= 1 << 0;
            else if (c == 'e') st ^= 1 << 1;
            else if (c == 'i') st ^= 1 << 2;
            else if (c == 'o') st ^= 1 << 3;
            else if (c == 'u') st ^= 1 << 4;
            if (m.containsKey(st)) res = Math.max(res, i - m.get(st));
            else m.put(st, i);
        }
        return res;
    }
}
