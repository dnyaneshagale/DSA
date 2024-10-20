import java.util.Stack;

class StackOperations {
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            s.push(str.charAt(i));
        }

        StringBuilder sb = new StringBuilder("");
        while (! s.isEmpty()) {
            // char curr = s.pop();
            sb.append(s.pop());
        }
        return sb.toString();
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    
    public static void addAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        addAtBottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverseStack(s);
        addAtBottom(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);

        reverseStack(s);
        printStack(s);
    }
}
