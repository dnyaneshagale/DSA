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

    //Method 

    //Add First 
    public void addFirst(int data) { // Time : O(1)
        //Step 1 => Create new Node
        Node newNode = new Node(data);
        if(head == null) { //Check if head is null
            head = tail = newNode;
            return;
        }

        //Step 2 => New Node's next = head
        newNode.next = head;  //Linking

        //Step 3 => head = newNode
        head = newNode;
    }

    //Add Second
    public void addLast(int data) { //Time : O(1)
        //Step 1 => Create new Node
        Node newNode = new Node(data);
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
    }
}