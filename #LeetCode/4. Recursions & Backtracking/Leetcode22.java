class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list1 = new ArrayList<>();

        parenthesesGenerate(list1, n, 0, 0, "");

        return list1;
    }
    public void parenthesesGenerate(ArrayList<String> ans, int n, int open, int close, String curr) {

        if(curr.length() == n * 2) {
            ans.add(curr);
            return;
        }

        if(open < n) {
            parenthesesGenerate(ans, n, open + 1, close, curr + "(");
        }
        if(close < open) {
            parenthesesGenerate(ans, n, open, close + 1, curr + ")");
        }
    }
}