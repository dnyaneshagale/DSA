import java.util.Arrays;

public class Test {
    public static int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        
        return arr[arr.length-2];
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 10, 21};
        System.out.println(getSecondLargest(arr));
    }
}
