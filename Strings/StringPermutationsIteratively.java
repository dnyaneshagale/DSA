import java.io.*;
import java.util.*;

public class StringPermutationsIteratively {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        
        permutationsOfString(str);
    }

    public static int fact(int n){
        int val = 1;
        for(int i =1; i<=n; i++){
            val *= i;
        }
        
        return val;
    }

    public static void permutationsOfString(String str){
        int n = str.length();
        int f = fact(n);

        for(int i = 0; i<f; i++){
            StringBuilder sb = new StringBuilder(str); //used it because we have to manipulate String
            int dividend = i;

            for(int divisor = str.length(); divisor >= 1; divisor--){
                int quotient = dividend / divisor;
                int remainder = dividend % divisor;

                System.out.print(sb.charAt(remainder));
                sb.deleteCharAt(remainder);
                dividend = quotient;
            }
            System.out.println();
        }
    }
}
