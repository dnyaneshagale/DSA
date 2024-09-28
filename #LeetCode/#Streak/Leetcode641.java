class MyCircularDeque {
    private int[] deque;   // Array to hold the elements
    private int front;      // Index of the front element
    private int rear;       // Index of the next element to be inserted at the rear
    private int size;       // Current number of elements in the deque
    private int capacity;   // Maximum capacity of the deque

    public MyCircularDeque(int k) {
        capacity = k;
        deque = new int[k];
        front = 0;
        rear = 0;
        size = 0;
    }
    
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;  // Deque is full
        }
        front = (front - 1 + capacity) % capacity;  // Move front index back
        deque[front] = value;                        // Insert value
        size++;                                      // Increase size
        return true;
    }
    
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;  // Deque is full
        }
        deque[rear] = value;                        // Insert value at rear
        rear = (rear + 1) % capacity;               // Move rear index forward
        size++;                                      // Increase size
        return true;
    }
    
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;  // Deque is empty
        }
        front = (front + 1) % capacity;             // Move front index forward
        size--;                                      // Decrease size
        return true;
    }
    
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;  // Deque is empty
        }
        rear = (rear - 1 + capacity) % capacity;    // Move rear index back
        size--;                                      // Decrease size
        return true;
    }
    
    public int getFront() {
        if (isEmpty()) {
            return -1;  // Deque is empty
        }
        return deque[front];                         // Return front element
    }
    
    public int getRear() {
        if (isEmpty()) {
            return -1;  // Deque is empty
        }
        return deque[(rear - 1 + capacity) % capacity];  // Return last element
    }
    
    public boolean isEmpty() {
        return size == 0;                            // Check if size is 0
    }
    
    public boolean isFull() {
        return size == capacity;                     // Check if size equals max size
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */