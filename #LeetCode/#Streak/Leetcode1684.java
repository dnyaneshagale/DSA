class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int allowedMask = 0;

        // Build bitmask for allowed characters
        for (char c : allowed.toCharArray()) {
            allowedMask |= (1 << (c - 'a')); // Shift and set bit for each character
        }

        int count = 0;

        // Check each word
        for (String word : words) {
            int wordMask = 0;

            // Build bitmask for the word
            for (char c : word.toCharArray()) {
                wordMask |= (1 << (c - 'a'));
            }

            // If the word's bitmask is a subset of allowedMask, increment count
            if ((wordMask & ~allowedMask) == 0) {
                count++;
            }
        }

        return count;
    }
    
    /*
    MY APPROACH

    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        int ans = check(words, allowed, 0, 0);

        return ans;
    }

    public int check(String[] words, String allowed, int count, int ans) {
        for (int i = 0; i < words.length; i++) {
            count = 0; // Reset count for each word
            for (int j = 0; j < words[i].length(); j++) {
                boolean found = false;
                for (int k = 0; k < allowed.length(); k++) {
                    if (words[i].charAt(j) == allowed.charAt(k)) {
                        found = true;
                        break; // Exit inner loop once match is found
                    }
                }
                if (!found) {
                    count = -1; // Mark word as inconsistent
                    break;
                }
            }
            if (count != -1) {
                ans += 1; // Increment answer if word is consistent
            }
        }
        return ans;
    }
    */
}
