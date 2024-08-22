class Solution {
    public int findComplement(int num) {
        int mask = (Integer.highestOneBit(num) << 1) - 1;
        return ~num & mask;
    }

    /*
     * class Solution {
    public int findComplement(int num) {
        String s = toBinary(num);

        s = s.replace('0', 'x');
        s = s.replace('1', '0');
        s = s.replace('x', '1');

        int ans = binToInt(s);

        return ans;
    }

    public static String toBinary(int num) {
        if (num == 0) {
            return "0";
        }

        StringBuilder binStr = new StringBuilder();
        
        while (num > 0) {
            binStr.append(num % 2);
            num /= 2;
        }
        
        return binStr.reverse().toString();
    }

    public static int binToInt(String binStr) {
        int intValue = 0;
        int len = binStr.length();
        
        for (int i = 0; i < len; i++) {
            char c = binStr.charAt(len - 1 - i);
            if (c == '1') {
                intValue += Math.pow(2, i);
            }
        }
        
        return intValue;
    }
}
     */
}