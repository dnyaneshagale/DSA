class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0; // Tracks unmatched opening parentheses
        int unmatchedClose = 0; // Tracks unmatched closing parentheses

        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++; // Increment for every opening parenthesis
            } else if (c == ')') {
                if (open > 0) {
                    open--; // Match with an opening parenthesis
                } else {
                    unmatchedClose++; // No matching opening parenthesis
                }
            }
        }

        // Total additions required are unmatched open + unmatched close parentheses
        return open + unmatchedClose;
    }
}
