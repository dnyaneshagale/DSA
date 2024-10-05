class Solution {
    public long dividePlayers(int[] skill) {
        // Sort the array to easily pair the smallest and largest
        Arrays.sort(skill);
        
        int n = skill.length;
        long totalSum = 0;
        long productSum = 0;
        
        // The target sum for each pair
        int targetSum = skill[0] + skill[n - 1];
        
        // Iterate through and form pairs
        for (int i = 0; i < n / 2; i++) {
            int currentSum = skill[i] + skill[n - i - 1];
            
            // If current sum doesn't match the target, return -1
            if (currentSum != targetSum) {
                return -1;
            }
            
            // Accumulate the product of the paired skills
            productSum += (long) skill[i] * skill[n - i - 1];
        }
        
        return productSum;
    }
}
