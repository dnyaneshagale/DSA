import java.util.*;

public class RecursionTowerOfHanoi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //Number of Disks
        String d1 = scn.next(); //Name of 1st Disk
        String d2 = scn.next(); //Name of 2nd Disk
        String d3 = scn.next(); //Name of 3rd Disk
        towerOfHanoi(n, d1, d2, d3);
    }

    public static void towerOfHanoi(int n, String t1, String t2, String t3){
        if(n==0){
            return;
        }
        towerOfHanoi(n-1, t1, t3, t2);
        System.out.println("Move Disk " + n + " from "+ t1 + " -> " + t2 );
        towerOfHanoi(n-1, t3, t2, t1);
    }
}
