import java.util.*;
import java.io.*;

public class QuickSort {

    public static void quicksort(int[] arr, int lo, int hi){
        if(lo>=hi){
            return ;
        }
        int pivot = arr[hi];
        int pi = partition(arr, pivot, lo, hi);
        quicksort(arr, lo, pi - 1);
        quicksort(arr, pi + 1, hi);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        int[] arr = new int[N];
        for(int i=0; i<arr.length; i++){
            arr[i]=scn.nextInt();
        }

        quicksort(arr, 0, arr.length-1);
    }

    public static void swap(int[] arr, int i, int j){
        System.out.println("Swapping "+ arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr, int pivot, int lo, int hi){
        //0 to j-1 -> <= pivot
        //j to i-1 -> > pivot
        //i to end -> unknown

        System.out.println("pivot -> "+pivot);
        int i=lo; 
        int j=lo;

        while(i <= hi){
            if(arr[i]>pivot){
                i++;
            }else{
                swap(arr, i, j);
                i++;
                j++;
            }
        }
        System.out.println("Pivot Index -> " + (j-1));
        return (j-1);
    }
}
