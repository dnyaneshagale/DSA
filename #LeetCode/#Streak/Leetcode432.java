class AllOne {
    // Map from key to its count
    private Map<String, Integer> keyCountMap;
    // Map from count to a set of keys having that count
    private Map<Integer, LinkedHashSet<String>> countKeySetMap;
    // Track the current min and max counts
    private int minCount;
    private int maxCount;

    public AllOne() {
        keyCountMap = new HashMap<>();
        countKeySetMap = new HashMap<>();
        minCount = 0;
        maxCount = 0;
    }
    
    public void inc(String key) {
        // Get current count of the key (if present)
        int count = keyCountMap.getOrDefault(key, 0);
        
        // Remove the key from its current count set (if it's already present)
        if (count > 0) {
            countKeySetMap.get(count).remove(key);
            // If the set becomes empty, remove the count from the map
            if (countKeySetMap.get(count).isEmpty()) {
                countKeySetMap.remove(count);
                // Update minCount if we are removing the min count
                if (minCount == count) {
                    minCount++;
                }
            }
        }

        // Increment the count
        count++;
        keyCountMap.put(key, count);
        
        // Add the key to the new count's set
        countKeySetMap.computeIfAbsent(count, k -> new LinkedHashSet<>()).add(key);
        
        // Update maxCount
        maxCount = Math.max(maxCount, count);
        // If this is the only key or the minCount was 0, update minCount
        if (minCount == 0 || minCount > count) {
            minCount = count;
        }
    }
    
    public void dec(String key) {
        // Get the current count of the key
        int count = keyCountMap.getOrDefault(key, 0);
        if (count == 0) {
            return;  // Key doesn't exist
        }
        
        // Remove the key from its current count set
        countKeySetMap.get(count).remove(key);
        // If the set becomes empty, remove the count from the map
        if (countKeySetMap.get(count).isEmpty()) {
            countKeySetMap.remove(count);
            // Update maxCount if we are removing the max count
            if (maxCount == count) {
                maxCount--;
            }
            // Update minCount if we are removing the min count
            if (minCount == count) {
                // Find the new min count
                if (countKeySetMap.isEmpty()) {
                    minCount = 0;  // No keys left
                } else {
                    minCount = Collections.min(countKeySetMap.keySet());
                }
            }
        }
        
        // Decrement the count
        count--;
        if (count == 0) {
            keyCountMap.remove(key);  // If count reaches 0, remove the key entirely
        } else {
            keyCountMap.put(key, count);
            // Add the key to the new count's set
            countKeySetMap.computeIfAbsent(count, k -> new LinkedHashSet<>()).add(key);
            // Update minCount
            minCount = Math.min(minCount, count);
        }
    }
    
    public String getMaxKey() {
        if (maxCount == 0) {
            return "";  // No keys exist
        }
        // Return any key from the max count set
        return countKeySetMap.get(maxCount).iterator().next();
    }
    
    public String getMinKey() {
        if (minCount == 0) {
            return "";  // No keys exist
        }
        // Return any key from the min count set
        return countKeySetMap.get(minCount).iterator().next();
    }
}
