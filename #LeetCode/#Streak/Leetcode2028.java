class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int total = n + rolls.length;

        long missing = (total*(long)mean) - (long)Arrays.stream(rolls).sum();

        if(missing < n || missing > n*6) return new int[0];

        int[] ans = new int[n];
        Arrays.fill(ans, (int)missing/n);
        missing %= n;

        int i = 0;
        while(missing > 0 && i < n) {
            if(ans[i] + missing <= 6) {
                ans[i] += missing;
                missing = 0;
            } else {
                int temp = 6 - ans[i];
                ans[i] = 6;
                missing -= temp;
            }
            i++;
        }
        return ans;
    }
}