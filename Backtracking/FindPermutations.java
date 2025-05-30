public class FindPermutations {
    public static void findPermutation(String str, String ans) {
        // Base Case 
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        
        // Recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            String newStr = str.substring(0, i) + str.substring(i+1);

            findPermutation(newStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        findPermutation(str, "");
    }
}
