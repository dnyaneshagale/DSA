import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        int[] arr = {5, 1, 7, 4, 2};
        Stack<Integer> s = new Stack<>();

        int[] nextGreatest = new int[arr.length];

        for(int i = arr.length-1; i >= 0; i--){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nextGreatest[i] = -1;
            }else{
                nextGreatest[i] = arr[s.peek()];
            }
            s.push(i);
        }

        for(int i = 0; i < nextGreatest.length; i++){
            System.out.print(nextGreatest[i] + " ");
        }
    }
}
