import java.util.*;
import java.util.LinkedList;

public class StackUsing2Queues {
    static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        // isEmpty
        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        // Push
        public static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
        }

        // Pop 
        public static int pop(){
            if(isEmpty()){
                return -1;
            }

            int top = -1;
            
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }else{
                while(!q2.isEmpty()){
                    top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }

            int top = -1;
            
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();

                    q2.add(top);
                }
            }else{
                while(!q2.isEmpty()){
                    top = q2.remove();

                    q1.add(top);
                }
            }
            return top;
        }
    }    
}
