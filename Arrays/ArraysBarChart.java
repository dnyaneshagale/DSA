import java.io.*;
import java.util.*;

public class ArraysBarChart {
    // Input will be given, we will print '*' as the value of input (eg. 2 = * \n *)

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<arr.length; i++){
            arr[i]=scn.nextInt();
        }

        int max = arr[0];          //Building ka Top Floor
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for(int floor=max; floor>=1; floor--){     //Floors upar se niche ayege Brick n Air deploy krte krte
            for(int i=0; i<arr.length; i++){
                if(arr[i]>=floor){
                    System.out.print("*\t");    //Bricks daali gayi
                }else{
                    System.out.print("\t");     //jaha Bricks nahi vaha Air hai
                }
            }
            System.out.println();                 //New Line yaane New Floor
        }
    }
}
//Sir ne isko Building ke Floors and Bricks ka example deke samzaya tha, eg.:
// 3            *
// 2        *   *
// 1    *   *   *
//      1   2   3