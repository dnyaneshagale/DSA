import java.util.Scanner;

public class ScalarClass1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        System.out.println(sum(n));
    }

    private static int sum(int N){
        
        if(N==0){
            return 0;
        }

        int a = sum(N-1);

        return a+N;
    }
}