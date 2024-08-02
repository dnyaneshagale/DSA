import java.util.*;
import java.io.*;

public class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int data= 70;

        int l = 0;  //Low
        int h = arr.length-1;   //High

        while(l<=h){
            int m = (l+h)/2;        //Mid = (low+High)/2
            if(data>arr[m]){
                l = m +1;
            }else if(data<arr[m]){
                h = m-1;
            }else{
                System.out.println(m);
                return;
            }
        }
        System.out.println(-1);
    }
}