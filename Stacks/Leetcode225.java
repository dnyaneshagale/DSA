class MyStack {
    ArrayList<Integer> list = new ArrayList<>();
    
    public MyStack() {
        // Constructor can be left empty or used for initialization if needed
    }
    
    public void push(int x) {
        list.add(x);
    }
    
    public int pop() {
        if(empty()){
            return -1;
        }

        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }
    
    public int top() {
        if(empty()){
            return -1;
        }

        return list.get(list.size() - 1);
    }
    
    public boolean empty() {
        return list.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
