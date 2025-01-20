package DP;
import java.util.*;

public class Knapsack_0_1 {
    public static int knapsack(int[] val, int[] wt, int W, int n) {
        if (W == 0 || n == 0) {
            return 0;
        }

        if (wt[n-1] <= W) { // Valid Case (Include and Check Best Answer)
            //Include
            int ans1 = val[n-1] + knapsack(val, wt, W-wt[n-1], n-1); // Added in Val

            // Exclude
            int ans2 = knapsack(val, wt, W, n-1);

            // Compare and Return Best Answer
            return Math.max(ans1, ans2);
        } else {
            // Invalid Case (Exculde)
            return knapsack(val, wt, W, n-1);
        }
    }

    public static int knapsack(int[] val, int[] wt, int W, int n, int[][] dp) {
        if (W == 0 || n == 0) {
            return 0;
        }

        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        if (wt[n-1] <= W) { // Valid Case (Include and Check Best Answer)
            //Include
            int ans1 = val[n-1] + knapsack(val, wt, W-wt[n-1], n-1, dp); // Added in Val

            // Exclude
            int ans2 = knapsack(val, wt, W, n-1, dp);

            // Compare and Return Best Answer
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        } else {
            // Invalid Case (Exculde)
            dp[n][W] = knapsack(val, wt, W, n-1, dp);
            return dp[n][W];
        }
    }


    // Tabulation Technique

    public static int knapsackTab(int[] val, int[] wt, int W) {
        int n = val.length;
        int[][] dp = new int[n+1][W+1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }

        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }


        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int v = val[i-1];
                int w = wt[i-1];

                if (w <= j) {
                    int incrProf = v + dp[i-1][j-w];
                    int exclProf = dp[i-1][j];

                    dp[i][j] = Math.max(incrProf, exclProf);
                } else {
                    int exclProf = dp[i-1][j];
                    dp[i][j] = exclProf;
                }
            }
        }
        return dp[n][W];
    }
    
    public static void main(String[] args) {
        int[] val = {15, 14, 10, 45, 30};
        int[] wt = {2, 5, 1, 3, 4};
        int W = 7; 

        System.out.println("Recursive Answer : " + knapsack(val, wt, W, val.length));

        // Memoisation Approach
        int[][] dp  = new int[val.length+1][W+1];
        for (int i = 0; i <= val.length; i++) {
            for (int j = 0; j <= W; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println("Memoisation Answer : " + knapsack(val, wt, W, val.length, dp));


        System.out.println("Tabulation Answer : " + knapsackTab(val, wt, W));

    }    
}
