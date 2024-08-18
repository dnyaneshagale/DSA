class Solution {
    public String frequencySort(String s) {
        // Step 1: Build a frequency map
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (hm.containsKey(ch)) {
                int of = hm.get(ch); // old frequency
                int nf = of + 1; // new frequency
                hm.put(ch, nf);
            } else {
                hm.put(ch, 1);
            }
        }

        // Step 2: Create a list of characters sorted by frequency
        List<Character> chars = new ArrayList<>(hm.keySet());
        chars.sort((a, b) -> hm.get(b) - hm.get(a)); // sort in descending order

        // Step 3: Build the result string
        StringBuilder sb = new StringBuilder();
        for (char ch : chars) {
            int frequency = hm.get(ch);
            for (int i = 0; i < frequency; i++) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
