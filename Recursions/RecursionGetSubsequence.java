import java.util.*;
import java.io.*;

public class RecursionGetSubsequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        ArrayList <String> list = gss(str); //gss -> Get Sub-String
        System.out.println(list);
    }

    public static ArrayList<String> gss(String str){


        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>();  //bres -> base result
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1); //Rest Of String (After Index 1) 
        ArrayList<String> rres = gss(ros); //rres -> recursion result

        ArrayList<String> mres = new ArrayList<>(); //mres -> my result
        for(String rstr : rres){ //rres -> Recursion Result
            mres.add(" "+ rstr); //rstr -> Recursion String
            mres.add(ch + rstr);
        }

        // for(String rstr : rres){
        //     mres.add(ch + rstr);
        // }

        return mres;

    }
}
