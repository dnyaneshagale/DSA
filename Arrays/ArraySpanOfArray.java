import java.io.*;
import java.util.*;

public class ArraySpanOfArray {
    //You are given N terms, Find their span, span = max - min. print span

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt();

        int[] arr = new int[N];

        for(int i=0; i<arr.length; i++){
            arr [i]=scn.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }

            if(arr[i]<min){
                min=arr[i];
            }
        }
        int span = max - min ;

        System.out.println("Span : " + span);
    }
}
