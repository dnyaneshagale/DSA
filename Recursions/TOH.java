import java.util.*;
import java.lang.Math;

public class TOH {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String t1 = scn.next();
        String t2 = scn.next();
        String t3 = scn.next();
        towerOfHanoi(n, t1, t2, t3);
    }

    public static void towerOfHanoi(int n, String t1, String t2, String t3){
        if(n==0){
            return;
        }
        towerOfHanoi(n-1, t1, t3, t2);
        System.out.println("["+ t1 + " -> " + t2+"]" );
        towerOfHanoi(n-1, t3, t2, t1);

        
    }
}
