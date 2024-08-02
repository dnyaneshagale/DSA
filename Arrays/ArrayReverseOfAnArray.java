import java.io.*;
import java.util.*;

public class ArrayReverseOfAnArray {

    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
        for(int val : a){
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void reverse(int[] a){
        int i=0;
        int j=a.length-1;

        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=scn.nextInt();
        }
        reverse(a);
        display(a);
    }
}
