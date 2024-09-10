import java.util.*;
import java.io.*;

public class InsertionSort{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i<arr.length; i++){
            arr[i]=scn.nextInt();
        }

        insertionSort(arr);
        print(arr);
    }

    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int prev = i - 1;
            //Find out correct position to insert
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }


    public static void print(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}