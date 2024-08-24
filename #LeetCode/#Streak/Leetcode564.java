class Solution {
    public String nearestPalindromic(String n) {
        int len = n.length();
        long num = Long.parseLong(n);
        long half = Long.parseLong(n.substring(0, (len + 1) / 2));

        String[] cands = new String[]{
            makePalin(half, len % 2 == 0),
            makePalin(half - 1, len % 2 == 0),
            makePalin(half + 1, len % 2 == 0),
            generateAllNines(len - 1),
            generateAllOnes(len)
        };

        String res = "";
        long minDiff = Long.MAX_VALUE;

        for (String cand : cands) {
            if (cand.isEmpty() || cand.equals(n)) continue;
            long candNum = Long.parseLong(cand);
            long diff = Math.abs(candNum - num);
            if (diff < minDiff || (diff == minDiff && candNum < Long.parseLong(res))) {
                minDiff = diff;
                res = cand;
            }
        }

        return res;
    }

    private String makePalin(long half, boolean even) {
        String hStr = String.valueOf(half);
        String rev = new StringBuilder(hStr).reverse().toString();
        return even ? hStr + rev : hStr + rev.substring(1);
    }

    private String generateAllNines(int len) {
        return "9".repeat(len);
    }

    private String generateAllOnes(int len) {
        return "1" + "0".repeat(len - 1) + "1";
    }
}
