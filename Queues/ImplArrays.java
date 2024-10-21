public class ImplArrays {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        public Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        
        // 1. isEmpty()
        public static boolean isEmpty(){  //O(1)
            return rear == -1;
        }

        // 2. Add() 
        public static void add(int data){  //O(1)
            if(rear == size - 1){
                System.out.println("Queue is Full");
                return;
            }

            rear = rear + 1;
            arr[rear] = data;
        }

        // 3. Remove
        public static int remove(){  //O(n)
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            int front = arr[0];
            for(int i = 0; i < rear; i++){
                arr[i] = arr[i+1];
            }
            rear = rear - 1;
            return front;
        }

        // 4. Peek
        public static int peek(){ //O(1)
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[0];
        }
    }
    
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
        q.peek();
    }
}
