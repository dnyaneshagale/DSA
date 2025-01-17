package DP;
import java.util.*;

public class Tabulation_In_DP {
    public static int fib(int n) {
        int[] dp = new int[n+1];
        
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i  <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
    public static void main(String[] args) {
        int a = fib(6);

        System.out.println(a);
    }    
}
