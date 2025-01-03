import java.util.HashMap;

public class IntroToHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        
        
        // 1. Add  O(1)
        hm.put("India", 100);
        hm.put("USA", 50);
        hm.put("China", 150);
        hm.put("Japan", 30);

        // 2. Print
        System.out.println(hm);

        // 3. Get  O(1)
        int population = hm.get("USA");
        System.out.println(population);

        System.out.println(hm.get("Indonasia"));

        // 4. Delete / Remove   O(1) 
        hm.remove("China");
        System.out.println(hm);
        System.out.println(hm.remove("Indonasia"));

        // 5. Contains Key
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonasia"));

        // 6. Size
        System.out.println(hm.size());

        // 7. Clear Map
        hm.clear();
        System.out.println(hm);
        
        
    }    
}
