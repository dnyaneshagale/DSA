import java.util.Scanner;

public class ScalarClass2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        display(arr, 0);

        scn.close();
    }

    public static void display(int[] arr, int i){
        if(i == arr.length) return;

        System.out.println(arr[i]);
        display(arr, i+1);
    }
}
