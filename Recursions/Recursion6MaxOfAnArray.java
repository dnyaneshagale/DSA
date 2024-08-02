import java.util.*;
import java.io.*;

public class Recursion6MaxOfAnArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr=new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i]=scn.nextInt();
        }

        int max = maxOfAnArray(arr, 0);
        System.out.println(max);
    }

    public static int maxOfAnArray(int[] arr, int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }

        int max = maxOfAnArray(arr, idx+1);
        if(arr[idx]<max){
            return max; 
        }else{
            return arr[idx];
        }
    }
}
