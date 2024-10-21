class MyCircularQueue {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    Node head;
    Node tail;
    int size = 0;
    int k;

    public MyCircularQueue(int k) {
        this.k = k;
        head = null;
        tail = null;
    }
    
    public boolean enQueue(int value) {
        Node newNode = new Node(value);
        if(head == null){
            head = tail = newNode;
            size++;
            return true;
        }else if(size < k){
            tail.next = newNode;
            tail = newNode;
            size++;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(head == null){
            return false;
        }

        if(size == 1){
            head = tail = null;
            size--;
            return true;
        }

        head = head.next;
        size--;
        return true;
    }
    
    public int Front() {
        if(head == null){
            return -1;
        }
        return head.data;
    }
    
    public int Rear() {
        if(head == null){
            return -1;
        }
        return tail.data;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return (size == k);
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */