class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> dict = new HashSet<>();
        for (String word : dictionary) {
            dict.add(word);
        }
        return solve(s, dict, 0, new Integer[s.length()]);
    }

    private int solve(String s, Set<String> dict, int start, Integer[] memo) {
        if (start == s.length()) return 0;
        if (memo[start] != null) return memo[start];
        
        int minExtra = s.length(); // max possible extra chars
        StringBuilder sb = new StringBuilder();
        
        for (int i = start; i < s.length(); i++) {
            sb.append(s.charAt(i));
            String sub = sb.toString();
            int extra = dict.contains(sub) ? 0 : sub.length();
            minExtra = Math.min(minExtra, extra + solve(s, dict, i + 1, memo));
        }
        
        return memo[start] = minExtra;
    }
}