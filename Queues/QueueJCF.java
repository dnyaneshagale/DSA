import java.util.*;
import java.util.LinkedList;
public class QueueJCF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Using LinkedList Class : ");
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
 /*
  - Queue is an Interface in Java. 
  - Interfaces cannot be Created as Objects
  - so we use either LinkedList or ArrayDeque Class to create Queue.
  */


        q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("\nUsing ArrayDeque Class : ");
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }



        System.out.println("  - Queue is an Interface in Java. \r\n" +
                        "  - Interfaces cannot be Created as Objects\r\n" +
                        "  - so we use either LinkedList or ArrayDeque Class to create Queue.");
    }
}
