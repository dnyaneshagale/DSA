class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;

        for (i = 0; i < s.length; i++) {
            if (i < j) {
                swap(s, i, j);
                j--;
            }
        }
    }
    public void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}