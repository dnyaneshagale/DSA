public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //Add First
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

        return;
    }

    //Add Last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

        return;
        
    }

    //Print
    public void print(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //Remove First
    public int removeFirst(){
        if(head == null){
            System.out.println("List is Empty");
            return Integer.MIN_VALUE;
        }

        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;

        return val;
    }

    //Reverse a Double Linked List
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;            
        }
        head = prev;
    }

    //Remove Last
    public int removeLast(){
        if(head == null){
            System.out.println("List is Empty");
            return Integer.MIN_VALUE;
        }

        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;

        return val;
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(30);
        dll.addFirst(20);
        dll.addFirst(10);
        dll.addFirst(5);
        dll.addFirst(1);

        dll.print();
        System.out.println(dll.size);

        dll.removeFirst();
        dll.print();
        System.out.println(dll.size);

        dll.addLast(35);
        dll.addLast(40);
        dll.print();
        System.out.println(dll.size);

        dll.removeLast();
        dll.removeLast();
        dll.print();
        System.out.println(dll.size);

        
        dll.reverse();
        dll.print();
        System.out.println(dll.size);
    }
}
