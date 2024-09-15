import java.util.*;
import java.io.*;

public class MergeSort {
    public static void mergeSort(int[] arr, int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr, si, mid, ei);
    }

    public static void print(int[] arr){
        for(int chu : arr) {
            System.out.print(chu + " ");
        }
    }


    public static void merge(int[] arr, int si, int mid, int ei){
        int[] temp = new int[ei - si + 1]; //res -> Sum of Arrays when Added Together

        int i = si; //iterator for right part
        int j = mid+1; //iterator for right part
        int k = 0; //iterator for temp array


        while(i<= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k]= arr[i];
                i++;
                k++;
            }else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        //left part
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        //copy temp to original array
        for(k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Enter size Array");
        // int m = scn.nextInt();

        // System.out.println("Enter Elements in Array");
        // int[] a = new int[m];
        // for(int i = 0; i<a.length; i++){
        //     a[i]=scn.nextInt();
        // }

        int[] arr = {9, 4, 6, 3, 7, 1, 2, 8};

        mergeSort(arr, 0, arr.length-1);

        print(arr);
        
    }

}
