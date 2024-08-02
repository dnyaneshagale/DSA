import java.io.*;
import java.util.*;

public class CharToASCII {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            int ascii = (int) character;
            System.out.println("ASCII value of '" + character + "' is: " + ascii);
        }
    }
}


