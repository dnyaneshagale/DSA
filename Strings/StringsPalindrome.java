import java.io.*;
import java.util.*;

public class StringsPalindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        boolean ans = isPalindrome(s);
        System.out.println(ans);
    }

    public static void solution(String str){
        for(int i=0; i<str.length(); i++){
            for(int j = i+1; j<=str.length(); j++){
                String ss = str.substring(i,j);
                if (isPalindrome(str)==true) {
                    System.out.println(ss);
                }
            }
        }
    }

    public static boolean isPalindrome(String str){
        int i=0;
        int j= str.length()-1;

        while (i<=j) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);
            if(ch1!=ch2){
                return false;
                
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}
