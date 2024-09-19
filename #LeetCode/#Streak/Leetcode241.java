import java.util.*;

class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        
        // Check each character in the expression
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            
            // If the character is an operator
            if (c == '+' || c == '-' || c == '*') {
                // Recursively divide the expression into two parts
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));
                
                // Combine the results from both parts using the operator
                for (int l : left) {
                    for (int r : right) {
                        if (c == '+') {
                            result.add(l + r);
                        } else if (c == '-') {
                            result.add(l - r);
                        } else if (c == '*') {
                            result.add(l * r);
                        }
                    }
                }
            }
        }
        
        // Base case: If no operator was found, the expression is a number
        if (result.isEmpty()) {
            result.add(Integer.parseInt(expression));
        }
        
        return result;
    }
}