public class ArraysBacktrack {
    public static void changeArr(int[] arr, int i, int val) {
        // Base Case 
        if (i == arr.length) {
            printArr(arr, 0);
            return;
        }

        // Recursion
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i] - 2;
    }

    public static void printArr (int[] arr, int i) {
        if (i == arr.length-1) {
            return;
        }

        System.out.print(arr[i] + " ");
        printArr(arr, i+1);
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArr(arr, 0, 1);
        System.out.println();
        printArr(arr, 0);
    }
}
