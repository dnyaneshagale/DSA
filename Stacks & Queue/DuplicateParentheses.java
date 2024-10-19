import java.util.Stack;

public class DuplicateParentheses {

    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            
            if(ch == ')'){
                int count = 0;
                while (s.pop() != '(') {
                    count++;               
                }

                if(count < 1){
                    return true;
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "((a+b))"; //True (Duplicate Bracket Exists)
        String str2 = "(a+b)"; //False (Duplicate Bracket doesn't exist)
        System.out.println(isDuplicate(str2));
    }
}
