import java.util.*;


public class Stringbuffer {

    public static void main(String[] args) {

    /* Since , String Builder and String Buffer both are same Both can 
     * have similar functions use.
     * 
     * but StringBuffer is said to be " String Buffers are Thread Safe"
    */


        //Scanner scn = new Scanner(System.in);

        //1. Declaration of StringBuilder
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);

        //1.1 Print Character at Index
        char ch = sb.charAt(0);
        System.out.println(ch);

        //2. Update Values
        sb.setCharAt(0, 'd');
        System.out.println(sb);

        //3. Insert Values
        sb.insert(2, 'y');
        System.out.println(sb);

        //4. Delete Values
        sb.deleteCharAt(2);
        System.out.println(sb);

        //5. Append
        sb.append('g');
        System.out.println(sb);

        //6. get length
        System.out.println(sb.length());

        //To get Current time 
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        long duration = end - start;

    }

}
