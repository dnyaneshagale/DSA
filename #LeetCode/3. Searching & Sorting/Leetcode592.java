class Solution {
    public String fractionAddition(String expression) {
        String[] frs = expression.split("(?=[+-])");

        long num = 0;
        long den = 1;

        for(String fr : frs) {
            String[] curr = fr.split("/");
            long a = Long.parseLong(curr[0]);
            long b = Long.parseLong(curr[1]);
            num = num*b + a*den;
            den = den*b;
        }

        if (num == 0) return "0/1";
        long gcd = gcd(Math.abs(num), Math.abs(den));
        num /= gcd;
        den /= gcd;

        return num + "/" + den;
    }

    private long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}