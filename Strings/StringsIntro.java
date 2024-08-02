import java.util.*;
import java.io.*;

public class StringsIntro {
    public static void main(String[] args) {
        //Declaration No. 1 : ->
        String s = new String();
        s = " ";

        //Declaration No. 2 : ->
        String st = new String("Dnyanesh");


        //Declaration No. 3 : ->
        String str = "Dnyanesh";

        //To Take Inputs
        Scanner scn = new Scanner(System.in);
        String s1 = scn.next();  // To get a 'char' as Input
        String s2 = scn.nextLine(); //To get a Line as Input

        //Some IMP Functions
        //1. length();
        System.out.println(s.length());

        //2. charAt()
        System.out.println(s.charAt(2));
        char ch = s.charAt(2);

        //3. SubString() 
        String s3 = "abcd";
        System.out.println(s3.substring(0,1)); // a
        System.out.println(s3.substring(0,2)); //ab
        System.out.println(s3.substring(2)); //cd
        System.out.println(s3.substring(3,4)); //d

        //To print All Substring
        for(int i = 0; i<= s.length(); i++){
            for(int j = i+1; i<=s.length(); j++){
                System.out.println(s.substring(i, j));
            }
        }

        //4. Concatenate
        String s4 = "Hello";
        s4 += 'W';
        s4 += 10;

        //also
        String s5 = s3 + s4; //Used " + " operator to Join 2 Strings


        //5. Split
        String s6 = "abc, def, ghi, jkl";
        String[] parts = s.split(" , , ");   // [abc , , def , , ghi , , jkl]
        for(int i = 0; i<parts.length; i++){
            System.out.println(parts[i]);
        }
    
    }
}
