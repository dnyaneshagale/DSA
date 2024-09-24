class Solution {
    // Trie Node definition
    class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
    }

    // Trie class
    class Trie {
        TrieNode root = new TrieNode();
        
        // Insert a number into the Trie
        public void insert(String num) {
            TrieNode node = root;
            for (char c : num.toCharArray()) {
                node.children.putIfAbsent(c, new TrieNode());
                node = node.children.get(c);
            }
        }

        // Find the longest common prefix between num and numbers in the Trie
        public int findLongestPrefix(String num) {
            TrieNode node = root;
            int len = 0;
            for (char c : num.toCharArray()) {
                if (node.children.containsKey(c)) {
                    node = node.children.get(c);
                    len++;
                } else {
                    break;
                }
            }
            return len;
        }
    }

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        // Step 1: Build Trie from arr1
        Trie trie = new Trie();
        for (int x : arr1) {
            trie.insert(String.valueOf(x));
        }

        // Step 2: Find longest common prefix for each element in arr2
        int maxLen = 0;
        for (int y : arr2) {
            int len = trie.findLongestPrefix(String.valueOf(y));
            maxLen = Math.max(maxLen, len);
        }

        return maxLen;
    }
}
