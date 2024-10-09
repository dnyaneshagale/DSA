class Solution {
    public int minSwaps(String s) {
        int balance = 0; // Tracks the balance of opening and closing brackets
        int maxNegativeBalance = 0; // Tracks the most unbalanced point

        for (char c : s.toCharArray()) {
            if (c == '[') {
                balance++; // Opening bracket increases balance
            } else {
                balance--; // Closing bracket decreases balance
            }
            // Track the maximum negative balance
            maxNegativeBalance = Math.min(maxNegativeBalance, balance);
        }

        // We need maxNegativeBalance / -2 swaps to fix the imbalance
        return (-maxNegativeBalance + 1) / 2;
    }
}
