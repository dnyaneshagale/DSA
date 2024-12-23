import java.util.*;

public class SubArrays{
    public static void printSubArrays(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                for(int k = i; k <= j; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        /*Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }*/

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        printSubArrays(arr);
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum = currSum + nums[i];
            maxSum = Math.max(currSum, maxSum);
            if(currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}
