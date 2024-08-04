import java.util.*;
import java.io.*;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.size());

        //Add Element
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list + " -> " + list.size());

        //Insertion
        list.add(1, 1000); //Adding 1000 at 1 Index
        System.out.println(list + " -> " + list.size());

        //Get Value
        int val = list.get(1); //Not like the Array where arr[1] is used
        System.out.println(val);

        //Set Value
        list.set(1,2000); //Setting 2000 at 1 index
        System.out.println(list + " -> " + list.size());

        //Remove Value
        list.remove(1); //Removed element at Index 1

        /*
        Note :
        1. Set Value ko Change karega . Change or Update u say
        2. Add value me insertion karega 
         */
    }
}
