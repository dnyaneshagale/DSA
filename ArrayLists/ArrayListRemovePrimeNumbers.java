import java.io.*;
import java.util.*;

public class ArrayListRemovePrimeNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(scn.nextInt());
        }

        solution(list);

        System.out.println(list);
    }

    public static boolean isPrime(int val){
        // if(val < 2){
        //     return false;
        // }

        for(int i = 2; i * i <= val; i++){
            if(val%i==0){
                return false;
            }
        }
        return true;
    }

    public static void solution(ArrayList<Integer> list){
        for(int i = list.size()-1; i>=0; i--){
            int val = list.get(i);

            if(isPrime(val)==true){
                list.remove(i);
            }
        }
    }
}
