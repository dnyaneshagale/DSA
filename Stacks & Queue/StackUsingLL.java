public class StackUsingLL{
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
        static Node head = null;

        // isEmpty
        public static boolean isEmpty(){
            return head == null;
        }

        // Push
        public static void push(int data){
            Node newNode = new Node(data);

            newNode.next = head;
            head = newNode;
        }

        // Pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }

            int top = head.data;
            head = head.next;

            return top;
        }

        // Peek
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}