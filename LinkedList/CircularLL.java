public class CircularLL {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }
    public static Node head;
    public static Node last;
    public static int size;

    //Insertion Operations
    public void addFirst(int data){
        Node newNode = new Node(data);
        
        if(size == 0){
            head = last = newNode;
            last.next = head;
            size++;
            return;
        }

        newNode.next = head;
        last.next = newNode;
        head = newNode;
        size++;
    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if(size == 0){
            head = last = newNode;
            last.next = head;
            size++;
            return;
        }

        newNode.next = head;
        last.next = newNode;
        last = newNode;
        size++;
    }

    //Deletion Operations
    public int removeFirst(){
        if(size == 0){
            System.out.println("List is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int data = head.data;
            head = last = null;
            size = 0;
            return data;
        }
        int data = head.data;
        head = head.next;
        last.next = head;
        size--;
        return data;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("List is Empty");
        }else if(size == 1){
            int data = head.data;
            head = last = null;
            size = 0;
            return data;
        }
        
        int data = head.data;
        Node temp = head;
        int i = 0;
        while(i < size - 2){
            temp = temp.next;
            i++;
        }
        temp.next = head;
        last = temp;
        size--;

        return data;
    }

    public void print(){
        if(size == 0){
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        
        while(size != 0){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            
            size--;
        }
        System.out.println("FirstNode");
    }
    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.addFirst(10);
        list.addFirst(9);
        list.addFirst(8);
        list.addLast(11);
        list.addLast(12);
        list.addLast(13);

        list.print();
    }
}
