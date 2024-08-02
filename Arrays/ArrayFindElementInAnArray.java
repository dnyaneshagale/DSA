import java.io.*;
import java.util.*;

public class ArrayFindElementInAnArray {
    //Input me array milega usme se data find karenge, 
    // agar mil gaya to uska index or agar nahi mila to '-1' print karenge
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt();

        int[] arr = new int[N];
        for(int i =0; i< arr.length; i++){
            arr[i]=scn.nextInt();
        }

        int data = scn.nextInt();
        int idx= -1;

        for(int i=0; i<arr.length;i++){
            if(arr[i]==data){
                idx = i;
                break;
            }
        }
        System.out.println(idx);

    }
}
