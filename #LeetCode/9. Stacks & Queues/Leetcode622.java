class MyCircularQueue {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;
    public int size = 0;
    public int k;

    public MyCircularQueue(int k) {
        this.k = k; //k  ->  size of Queue    
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        Node newNode = new Node(value);
        
        if(size == 0){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(size == 0){
            return false;
        }else if(size == 1){
            head = tail = null;
        }else{
            head = head.next;
        }
        size--;
        return true;
    }
    
    public int Front() {
        if(size == 0){
            return -1;
        }

        return head.data;
    }
    
    public int Rear() {
        if(size == 0){
            return -1;
        }

        return tail.data;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == k;
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