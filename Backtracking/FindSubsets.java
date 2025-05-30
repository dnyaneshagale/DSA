public class FindSubsets {

    public static void findSubsets(String str, String ans, int i) {
        // Base Case
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        // Recursion
        // Yes
        findSubsets(str, ans+str.charAt(i), i+1);

        // No
        findSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "ABC";
        findSubsets(str, "", 0);
    }
}
