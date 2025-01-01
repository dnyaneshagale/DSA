package Heap;
import java.util.*;

public class RevHeapSort {

    private static void heapify(int[] arr, int i, int size) {
        int minIdx = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < size && arr[left] < arr[minIdx]) {
            minIdx = left;
        }

        if(right < size && arr[right] < arr[minIdx]) {
            minIdx = right;
        }

        if(minIdx != i) {
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            heapify(arr, minIdx, size);
        }
    }


    public static void heapSort(int[] arr) {
        int n = arr.length;

        //Heapify The Leaf Nodes
        for(int i = n / 2; i >= 0; i--) {
            heapify(arr, i, n);
        }

        // Push Max to Last Idx

        for(int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }

    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 6, 8, 9, 5};

        heapSort(arr);

        for(int val : arr) {
            System.err.print(val + " ");
        }
    }
}
