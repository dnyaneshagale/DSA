import java.io.*;
import java.util.*;

public class ASCIIDifference {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(printWithASCIIDifference(str));
    }

    public static String printWithASCIIDifference(String str){
        StringBuffer sb = new StringBuffer(str);
        sb.append("\n"+str.charAt(0));

        for(int i=1; i<str.length();i++){
            char curr = sb.charAt(i);
            char prev = sb.charAt(i-1);
            int diff = curr-prev;

            sb.append(diff);
            sb.append(curr);
        }

        return sb.toString();
    }
}
