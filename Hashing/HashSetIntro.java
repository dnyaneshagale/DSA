import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameUI.InternalFrameLayout;

public class HashSetIntro {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(4);
        set.add(2);
        set.add(6);
        set.add(1);  //Not Added
        set.add(6); //Not Added

        System.out.println(set.contains(4) ? "It contains 4" : "False");

        set.remove(4);

        System.out.println(set.contains(4) ? "It contains 4" : "Don't Contains 4");

        System.out.println(set.size());

        System.out.println(set.isEmpty());


        // Iteration on HashSet

        Iterator itr = set.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println("\n");


        // Using Enhanced for Loop

        for(Integer num : set) {
            System.out.print(num + " ");
        }
    }
}
