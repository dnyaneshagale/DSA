import java.util.*;

public class Recursion3 {
    public static int powerLinear(int x, int n){
        
        if(n==0){
            return 1;
        }
        int p= powerLinear(x, n-1);
        int powlin = x*p;
        return powlin;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int x = scn.nextInt();
        int n = scn.nextInt();

        int power = powerLinear(x, n);
        System.out.println(power);
    }
}
