package Heap;
import java.util.*;

public class HeapSort {

    private static void heapify(int[] arr, int i, int size) {
        int maxIdx = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left < size && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }

        if(right < size && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }

        if(maxIdx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, size);
        }
    }
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Step 1 => For Ascending Sorting [Create Max Heap] 
        for(int i = n/2; i >= 0; i--) {
            heapify(arr, i, n);
        }

        // Step 2 => Push Largest Element at End (Swap hee krdete h)
        for(int i = n-1; i > 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapify(arr, 0, i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 6 ,2 , 9, 8};
        
        heapSort(arr);

        for(int val : arr) {
            System.out.print(val + " ");
        }
    }
}
