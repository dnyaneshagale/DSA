class Solution {
    public int nthUglyNumber(int n) {
        int[] nums = new int[n];

        int p2 = 0;
        int p3 = 0;
        int p5 = 0;

        nums[0] = 1;

        for(int i = 1; i < n; i++){
            int factor1 = 2 * nums[p2];
            int factor2 = 3 * nums[p3];
            int factor3 = 5 * nums[p5];

            int min = Math.min(factor1, Math.min(factor2, factor3));
            nums[i] = min;

            if(min == factor1){
                p2++;
            }

            if(min == factor2){
                p3++;
            }

            if(min == factor3){
                p5++;
            }
        }
        return nums[n-1];
    }
}