class TrieNode {
    Map<Character, TrieNode> children;
    int count;  // To keep track of the number of words sharing this prefix
    
    public TrieNode() {
        children = new HashMap<>();
        count = 0;
    }
}

class Trie {
    TrieNode root;
    
    public Trie() {
        root = new TrieNode();
    }
    
    // Insert word into Trie and update prefix counts
    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            node.count++;  // Increment count for each prefix
            if (!node.children.containsKey(c)) {
                node.children.put(c, new TrieNode());
            }
            node = node.children.get(c);
        }
        node.count++;  // Also count the last node
    }
    
    // Calculate the prefix score for a word
    public int getPrefixScore(String word) {
        TrieNode node = root;
        int score = 0;
        for (char c : word.toCharArray()) {
            if (node == null) break;
            node = node.children.get(c);
            score += node.count;  // Add the prefix count
        }
        return score;
    }
}

class Solution {
    public int[] sumPrefixScores(String[] words) {
        Trie trie = new Trie();
        int n = words.length;
        int[] result = new int[n];
        
        // Insert all words into the Trie
        for (String word : words) {
            trie.insert(word);
        }
        
        // Calculate prefix scores for each word
        for (int i = 0; i < n; i++) {
            result[i] = trie.getPrefixScore(words[i]);
        }
        
        return result;
    }
}