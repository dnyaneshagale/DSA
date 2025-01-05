import java.util.*;

public class LinkedHashSetIntro {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        
        lhs.add(12);
        lhs.add(2);
        lhs.add(3);
        lhs.add(7);
        lhs.add(10);

        System.out.println(lhs);
        
        System.out.println();

        Iterator itr = lhs.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
