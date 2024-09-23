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

    public int itrSearch(int key){ // O(n)
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;    
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key){
        if(head == null) return -1;
    
        if(head.data == key) return 0;

        int idx = helper(head.next, key);

        if(idx == -1) return -1;

        return idx+1;
    
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void removeNthFromEnd(int n){
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next;
            return;
        }

        Node prev = head;
        int i = 1;
        int idxToFind = sz - n;

        while(i < idxToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }

        return slow;
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null) return true;

        //Step 1 -> Find Middle Node
        Node midNode = findMid(head);

        //Step 2 -> 2nd Half ko Reverse
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        //Step 3 -> Check if Right Part is Equal to Left Part
        while(right != null){
            if(right.data != left.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }

        return true;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        System.out.println(ll.checkPalindrome());

        
        // ll.addFirst(1);

        // ll.addFirst(2);

        // ll.addLast(3);

        // ll.add(2, 9);

        // ll.print();
        // ll.reverse();
        // ll.removeNthFromEnd(2);
        // ll.print();

        // ll.removeFirst();
        // ll.removeLast();
        // System.out.println("Size => " + ll.size);
        // System.out.println("Iterative Search => ");
        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.itrSearch(8));

        // System.out.println("\n\nRecursive Search => ");
        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(8));

    }
}