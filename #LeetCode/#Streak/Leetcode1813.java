class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");
        
        int i = 0, j = 0; // pointers for the beginning
        int len1 = words1.length, len2 = words2.length;
        
        // Compare words from the start
        while (i < len1 && i < len2 && words1[i].equals(words2[i])) {
            i++;
        }
        
        // Compare words from the end
        while (j < len1 - i && j < len2 - i && words1[len1 - 1 - j].equals(words2[len2 - 1 - j])) {
            j++;
        }
        
        // If all unmatched words are in the middle, sentences are similar
        return i + j == Math.min(len1, len2);
    }
}
