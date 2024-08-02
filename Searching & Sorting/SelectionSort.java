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
            int mi = i; //mi -> Minimum Index
            for(int j = i+1; j < arr.length; j++){
                if (isSmaller(arr, j, mi)) {
                    mi = j;
                }
            }
            swap(arr, i, mi);
        }
    }



    public static boolean isSmaller(int[] arr, int i, int j){
        System.out.println("Comparing "+ arr[i]+ " and " + arr[j]);
        if(arr[i]<arr[j]){
            return true;
        }else{
            return false;
        }
    }

    public static void swap(int[] arr, int i, int j){
        System.out.println("Swapping "+ arr[i]+ " and "+arr[j]);

        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void print(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}