class Solution {
    private String getStart(HashMap<String, String> map) {
        HashMap<String, String> revMap = new HashMap<>();

        for(String s : map.keySet()) {
            revMap.put(map.get(s), s);
        }

        for(String s : map.keySet()) {
            if(!revMap.containsKey(s)) {
                return s;
            }
        }
        return " ";
    }

    public List<String> findItinerary(List<List<String>> tickets) {
        HashMap<String, String> map = new HashMap<>();

        for (List<String> ticket : tickets) {
            map.put(ticket.get(0), ticket.get(1));
        }

        String start = getStart(map);
        List<String> list = new ArrayList<>();

        list.add(start);

        for(String key : map.keySet()) {
            list.add(map.get(start));
            start = map.get(start);
        }

        return list;
    }
}