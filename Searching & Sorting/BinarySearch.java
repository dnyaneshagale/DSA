import java.util.*;
import java.io.*;

public class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int data= 70;

        int ans = binarySearch(arr, data);
        System.out.println(ans);
        
    }

    public static int binarySearch(int[] arr, int data) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (start+end)/2;

            if(arr[mid] == data) {
                return mid;
            }else if(arr[mid] < data) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
}