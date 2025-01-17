package DP;
import java.util.*;

public class Memoization_In_DP {
    public static int fib(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }

        if(dp[n] != 0) {
            return dp[n];
        }

        dp[n] = fib(n-1, dp) + fib(n-2, dp);

        return dp[n];
    }
    public static void main(String[] args) {
        int a = fib(6, new int[7]);

        System.out.println(a);
    }    
}
