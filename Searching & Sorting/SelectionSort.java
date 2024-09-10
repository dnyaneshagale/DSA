import java.util.*;
import java.io.*;

public class SelectionSort{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i<arr.length; i++){
            arr[i]=scn.nextInt();
        }

        SelectionSort(arr);
        print(arr);
    }

    public static void SelectionSort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            int minPos = i; //mi -> Minimum Index
            for(int j = i+1; j < arr.length; j++){
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }


    public static void print(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}