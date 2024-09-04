import java.util.Scanner;

public class ScalarClass3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int ans = getFirstOcc(arr, 12, 0);

        System.out.println(ans);
    }

    private static int getFirstOcc(int[] arr, int x, int i){
        if(i == arr.length) return -1;

        if(arr[i] == x){
            return i;
        }else{
            int idx = getFirstOcc(arr, x, i+1);
            return idx;
        }
    }
}
