import java.util.*;
import java.io.*;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int s1 = scn.nextInt();
        int s2 = scn.nextInt();

        int[][] arr = new int[s1][s2];
        for(int i=0; i<s1; i++){
            for(int j=0; j<s2; j++){
                arr[i][j]=scn.nextInt();
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}