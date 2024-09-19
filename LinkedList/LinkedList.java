public class LinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //Method 

    //Add First 
    public void addFirst(int data) { // Time : O(1)
        //Step 1 => Create new Node
        Node newNode = new Node(data);
        size++;
        if(head == null) { //Check if head is null
            head = tail = newNode;
            return;
        }

        //Step 2 => New Node's next = head
        newNode.next = head;  //Linking

        //Step 3 => head = newNode
        head = newNode;
    }

    //Add at Last
    public void addLast(int data) { //Time : O(1)
        //Step 1 => Create new Node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode; //Check if head is null
            return;
        }

        //Step 2 => tail.next = newNode
        tail.next = newNode; //Linking

        //Step 3 => tail = newNode
        tail = newNode;
    }

    // Add at any Index 
    public void add(int index, int data) { //Time : O(n)
        if(index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < index-1) {
            temp = temp.next;
            i++;
        }
        
        //i = index - 1; temp => prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL IS EMPTY");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = tail.data;
        int i = 0;
        Node temp = head;
        while(i < size - 2){
            temp = temp.next;
            i++;
        }
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    public void print(){
        //Never change a Head or Tail in LinkedList
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.add(2, 9);
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();

        System.out.println("Size => " + ll.size);
    }
}