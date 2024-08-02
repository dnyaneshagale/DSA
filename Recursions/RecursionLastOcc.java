import java.io.*;
import java.util.*;

public class RecursionLastOcc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i]=scn.nextInt();
        }

        int x = scn.nextInt();

        int foundidx = printLastOcc(arr, 0, x);
        System.out.println(foundidx);
    }

    public static int printLastOcc(int[] arr, int idx, int x){
        if(idx==arr.length){
            return -1;
        }

        int liisa = printLastOcc(arr, idx+1, x);
        if(liisa==-1){
            if(arr[idx]==x){
                return idx;
            }else{
                return -1;
            }
        }else{
            return liisa;
        }
    }
}
