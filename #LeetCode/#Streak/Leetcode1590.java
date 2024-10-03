import java.util.HashMap;

class Solution {
    public int minSubarray(int[] nums, int p) {
        // Calculate total sum
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }

        // If sum is already divisible by p, return 0
        long rem = sum % p;
        if (rem == 0) return 0;

        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L, -1); // To handle prefix sum from the start
        long currSum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            long mod = currSum % p;

            // Calculate the needed prefix sum
            long target = (mod - rem + p) % p;

            // Check if the target prefix exists
            if (map.containsKey(target)) {
                minLen = Math.min(minLen, i - map.get(target));
            }

            // Store the current prefix sum
            map.put(mod, i);
        }

        // Return -1 if no valid subarray found
        return (minLen == Integer.MAX_VALUE || minLen == nums.length) ? -1 : minLen;
    }
}