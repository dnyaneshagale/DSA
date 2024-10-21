public class CircularQueueUsingArrays {
    static class Queue{
        static int [] arr;
        static int size;
        static int rear;
        static int front;

        public Queue(int n){
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        // isEmpty()
        public static boolean isEmpty(){
            return front == -1 && rear == -1;
        }

        // isFull()
        public static boolean isFull(){
            return (rear + 1) % size == front;
        }

        // add
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }

            if(front == -1){ //To add First Element
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        //remove 
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = arr[front];

            if(front == rear){
                rear = front = - 1;
            }else{
                front = (front + 1) % size;
            }
            return result;
        }

        // Peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
