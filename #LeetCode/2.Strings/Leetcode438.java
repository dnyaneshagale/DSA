class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> indices = new ArrayList<>();
        if (s.length() < p.length()) return indices;
        
        int[] pmap = new int[26]; // Frequency map for `p`
        int[] smap = new int[26]; // Frequency map for the current window in `s`

        // Build frequency map for pattern `p`
        for (char ch : p.toCharArray()) {
            pmap[ch - 'a']++;
        }

        // Build frequency map for the first window of `s`
        for (int i = 0; i < p.length(); i++) {
            smap[s.charAt(i) - 'a']++;
        }

        // Check the first window
        if (matches(pmap, smap)) {
            indices.add(0);
        }

        // Slide the window across `s`
        for (int i = p.length(); i < s.length(); i++) {
            smap[s.charAt(i) - 'a']++; // Add new char to the window
            smap[s.charAt(i - p.length()) - 'a']--; // Remove old char from the window

            if (matches(pmap, smap)) {
                indices.add(i - p.length() + 1);
            }
        }

        return indices;
    }

    // Helper method to compare two frequency arrays
    private boolean matches(int[] pmap, int[] smap) {
        for (int i = 0; i < 26; i++) {
            if (pmap[i] != smap[i]) {
                return false;
            }
        }
        return true;
    }
}