import java.util.*;
import java.io.*;

public class BubbleSort{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i<arr.length; i++){
            arr[i]=scn.nextInt();
        }

        bubbleSort(arr);
        print(arr);
    }

    public static void bubbleSort(int[] arr){
        for(int turns = 0; turns < arr.length - 1; turns++){
            for(int j = 0; j < arr.length - 1 - turns; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void print(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}