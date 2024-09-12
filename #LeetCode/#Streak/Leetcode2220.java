class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal, flips = 0;
        while (xor > 0) {
            flips += xor & 1;
            xor >>= 1;
        }
        return flips;
    }
}