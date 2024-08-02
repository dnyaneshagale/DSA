import java.io.*;
import java.util.*;

public class StringsSubstring {
    public static void main(String[] args) {
        String s = "Dnyanesh";
        //printing substrings

        for(int i=0; i<s.length();i++){
            for(int j = i+1;j<=s.length(); j++){
                System.out.println(s.substring(i, j));
            }
        }
    }
}
