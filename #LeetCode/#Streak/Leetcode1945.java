class Solution {
    public int getLucky(String s, int k) {
        StringBuilder numStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            numStr.append(c - 'a' + 1);
        }

        while (k-- > 0) {
            int sum = 0;
            for (char c : numStr.toString().toCharArray()) {
                sum += c - '0';
            }
            numStr = new StringBuilder(String.valueOf(sum));
        }

        return Integer.parseInt(numStr.toString());
    }
}
