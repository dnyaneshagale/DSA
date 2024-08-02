import java.util.*;

public class Recursion2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int factorial = factorial(n);

        System.out.println(factorial);
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }

        int nm1 = factorial(n-1);
        int factorial = n * nm1;

        return factorial;
    }
}