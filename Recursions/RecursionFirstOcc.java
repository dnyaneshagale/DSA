import java.io.*;
import java.util.*;

public class RecursionFirstOcc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i]=scn.nextInt();
        }

        int find = scn.nextInt();

        int foundidx = printFirstOcc(arr, 0, find);
        System.out.println(foundidx);
    }

    public static int printFirstOcc(int[] arr, int idx, int x){
        if(idx==arr.length){
            return -1;
        }

        if(arr[idx]==x){
            return idx;
        }else{
            int fiisa=printFirstOcc(arr, idx+1, x);
            return fiisa;
        }
    }
}
