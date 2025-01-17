package DP;

import java.util.Arrays;

public class ClimbingStairs {
    public static int countClimbingStairs(int n, int[] ways) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        return countClimbingStairs(n-1, ways) + countClimbingStairs(n-2, ways);
    }

    public static int countStairs(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i-1] + 0;
            } else {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int[] ways = new int[6];
        Arrays.fill(ways, -1);
        int memoizationSol = countClimbingStairs(5, ways);

        int tabulationSol = countStairs(5);

        System.out.println("Memoization : " + memoizationSol + "\nTabulation : " + tabulationSol);

    }
}
