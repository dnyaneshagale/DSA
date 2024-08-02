import java.util.*;
import java.io.*;

public class MergeSort {
    public static int[] mergeSort(int[] arr, int lo, int hi){
        if(lo==hi){
            int[] ba = new int[1]; //bs = base array which has to break the recursive call
            ba[0]=arr[lo];
            return ba;
        }
        int mid = (lo+hi)/2;
        int[] fsh = mergeSort(arr, lo, mid); //fsh = First Sorted Array
        int[] ssh = mergeSort(arr, mid+1, hi);  //ssh = Second Sorted Array
        int[] fsa = mergeTwoSortedArrays(fsh, ssh);

        return fsa;
    }

    public static void printSortedArray(int[] arr){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }


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

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size Array");
        int m = scn.nextInt();

        System.out.println("Enter Elements in Array");
        int[] a = new int[m];
        for(int i = 0; i<a.length; i++){
            a[i]=scn.nextInt();
        }

        int[] sortedarray = mergeSort(a, 0, a.length-1);
        printSortedArray(sortedarray);
    }

}
