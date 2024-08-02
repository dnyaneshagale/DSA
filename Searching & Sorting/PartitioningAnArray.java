import java.util.*;
import java.io.*;

public class PartitioningAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        int[] arr = new int[N];
        for(int i=0; i<arr.length; i++){
            arr[i]=scn.nextInt();
        }
    }

    public static void swap(int[] arr, int i, int j){
        System.out.println("Swapping "+ arr[i] + " with " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr, int pivot){
        //0 to j-1 -> <= pivot
        //j to i-1 -> > pivot
        //i to end -> unknown

        int i=0; int j=0;

        while(i < arr.length){
            if(arr[i]<=pivot){
                swap(arr, i, j);
                i++;
                j++;
            }else{
                i++;
            }
        }
        System.out.println("Pivot Index -> " + (j-1));
        return (j-1);
    }
}
