class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int min = prices[0];
        int maxProfit = 0;

        // Loop through the array starting from the second element
        for (int i = 1; i < prices.length; i++) {
            // If the current price is less than min, update min
            if (prices[i] < min) {
                min = prices[i];
            } else {
                // Calculate the profit if selling at the current price
                int profit = prices[i] - min;
                // Update maxProfit if the current profit is greater
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit; // Return the maximum profit found
    
    }
}