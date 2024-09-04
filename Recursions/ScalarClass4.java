import java.util.*;

public class ScalarClass4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int ans = factorial(n);

        System.out.println(ans);
    }    

    private static int factorial(int N) {
        if(N==0) return 1;

        int nm1fact = factorial(N-1);

        return N * nm1fact;
    }
}
