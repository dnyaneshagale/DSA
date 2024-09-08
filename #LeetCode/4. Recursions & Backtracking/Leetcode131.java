class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();

        ansPartition(s, list, new ArrayList<>(), 0);

        return list;
    }


    private boolean isPalindrome(String s, int start, int end) {
        int left = start, right = end;
        
        // Loop until the two pointers meet in the middle
        while (left < right) {
            // Skip non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            
            // Check if characters at left and right pointers are equal (case-insensitive)
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            
            // Move pointers inward
            left++;
            right--;
        }
        
        return true; // Substring is a palindrome
    }


    private void ansPartition(String s, List<List<String>> list, List<String> temp, int start) {
        if(start == s.length()) {
            list.add(new ArrayList<>(temp));
            return;
        }
        

        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s, start, end)) {
                temp.add(s.substring(start, end + 1));  // Add the substring that is a palindrome
                ansPartition(s, list, temp, end + 1);   // Recurse for the next substring
                temp.remove(temp.size() - 1);           // Backtrack to explore other partitions
            }
        }
    }
}