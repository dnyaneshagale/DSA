class MinStack {
    class Node{
        int data;
        int min;
        Node next;

        public Node(int data, int min){
            this.data = data;
            this.min = min;
            this.next = null;
        }
    }

    public Node head = null;

    public MinStack() {
        
    }
    
    public void push(int val) {
        
        if(head == null){
            Node newNode = new Node(val, val);
            head = newNode;
            return;
        }
        Node newNode = new Node(val, Math.min(val, head.min));
        newNode.next = head;
        head = newNode;
    }
    
    public void pop() {
        if(head == null){
            return;
        }else if(head.next == null){
            head = null;
            return;
        }

        head = head.next;
    }
    
    public int top() {
        if(head == null){
            return -1;
        }else{
            return head.data;
        }
    }
    
    public int getMin() {
        if(head == null){
            return -1;
        }

        return head.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */