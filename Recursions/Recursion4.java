import java.util.*;

public class Recursion4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int n = scn.nextInt();

        int calcpower = powerUsingLog(x, n);

        System.out.println(calcpower);
        
    }

    public static int powerUsingLog(int x, int n){
        if(n==0){
            return 1;
        }
        int xnb2 = powerUsingLog(x, n/2);
        int xn = xnb2*xnb2;

        if(n%2==1){
            xn = xn*x;
        }
        return xn;
    }
}
