public class QueueUsingLinkedList {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        public static void add(int data){
            
            Node newNode = new Node(data);
            
            if(head == null){
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public static int remove(){
            if(isEmpty()){
                return -1;
            }

            int res = head.data;
            if(head == tail){
                head = tail = null;
            }else{
                head = head.next;
            }

            return res;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            return head.data;
        }
    }


    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
