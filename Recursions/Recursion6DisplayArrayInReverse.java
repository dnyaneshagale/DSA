import java.io.*;
import java.util.*;

public class Recursion6DisplayArrayInReverse{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i]=scn.nextInt();
        }
        displayArrayInReverse(arr, n-1);
    }

    public static void displayArrayInReverse(int[] arr, int idx){
        if(idx<0){
            return;
        }

        System.out.println(arr[idx]);
        displayArrayInReverse(arr, idx-1);
    }
}