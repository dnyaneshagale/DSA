import java.util.*;
import java.io.*;

public class MergeTwoSortedArrays {
    public static int[] mergeTwoSortedArrays(int[]a, int[] b){
        int[] res = new int[a.length+b.length]; //res -> Sum of Arrays when Added Together

        int i =0;
        int j =0;
        int k = 0;


        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                res[k]= a[i];
                i++;
                k++;
            }else{
                res[k]=b[j];
                j++;
                k++;
            }
        }

        while(i < a.length){
            res[k]=a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            res[k]=b[j];
            j++;
            k++;
        }
        return res;
    }

    public static void print(int[] arr){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter No. of Elements in 1st Array");
        int m = scn.nextInt();
        

        System.out.println("Enter Elements in 1st Array");
        int[] a = new int[m];
        for(int i = 0; i<a.length; i++){
            a[i]=scn.nextInt();
        }
        System.out.println("Enter No. of Elements in 2nd Array");
        int n = scn.nextInt();

        System.out.println("Enter Elements in 2nd Array");
        int[] b = new int[n];
        for(int i =0; i<b.length; i++){
            b[i]=scn.nextInt();
        }


        int[] mergedarray = mergeTwoSortedArrays(a, b);
        print(mergedarray);

    }
}
