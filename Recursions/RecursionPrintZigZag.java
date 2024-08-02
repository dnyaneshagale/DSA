import java.util.*;

public class RecursionPrintZigZag {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        printZigZag(n);
    }

    public static void printZigZag(int n){
        if(n==0){
            return;
        }
        System.out.println("Pre "+ n);
        printZigZag(n-1);
        System.out.println("In "+n);
        printZigZag(n-1);
        System.out.println("Post "+n);
    }
}
