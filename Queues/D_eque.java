import java.util.*;
public class D_eque {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);

        System.out.println(deque);
    }
}