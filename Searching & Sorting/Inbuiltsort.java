import java.util.*;

public class Inbuiltsort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Integer[] arr = new Integer[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        inbuiltSort(arr);
        for(int val : arr) {
            System.out.print(val);
        }
    }

    public static void inbuiltSort(Integer[] arr){
        // Arrays.sort(arr);

        // Arrays.sort(arr, 0, 3); // Arrays.sort(arr, startIdx, endIdx(exclusive));

        Arrays.sort(arr, Collections.reverseOrder());
    }
}
