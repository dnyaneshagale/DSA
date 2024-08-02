import java.util.*;

public class StackIntro {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>(); //Declaration of Stack

        st.push(10);    //push(10) -> To add '10' in the stack

        System.out.println(st +" -> " + st.peek() + " " + st.size()); //peek() -> To fetch last element in Stack
        st.push(20);
        System.out.println(st +" -> " +st.peek() + " " + st.size()); //size() -> To know the size of the Stack
        st.push(30);
        System.out.println(st +" -> " +st.peek() + " " + st.size());
        st.push(40);
        System.out.println(st +" -> " +st.peek() + " " + st.size());
        st.pop();
        System.out.println(st +" -> " +st.peek() + " " + st.size());
        st.pop();
        System.out.println(st +" -> " +st.peek() + " " + st.size());
        st.pop();
        System.out.println(st +" -> " + st.size());

    }
}
