import java.util.*;

public class QueueIntro {
    public static void main(String[] args) {
        Queue<Integer> que = new ArrayDeque<>(); //Declaration of Que

        que.add(10);        // add() -> To add a value in Que
        System.out.println(que); //To print the Queue
        que.add(20);
        System.out.println(que);
        que.add(30);
        System.out.println(que);

        System.out.println(que.peek()); //To get the last element in Queue
        System.out.println(que);
        System.out.println(que.remove()); //To remove the last element in Queue
        System.out.println(que);

    }
}
