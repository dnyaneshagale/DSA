class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, ArrayList<String>> bMap = new HashMap<>();

        for(String s : strs) {
            HashMap<Character, Integer> freqMap = new HashMap<>();

            for(int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }

            if(bMap.containsKey(freqMap) == false) {
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                bMap.put(freqMap, list);
            } else {
                ArrayList<String> list = bMap.get(freqMap);
                list.add(s);
            }
        }

        List<List<String>> list = new ArrayList<>();
        for(ArrayList<String> str : bMap.values()) {
            list.add(str);
        }

        return list;
    }
}