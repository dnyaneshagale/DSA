import java.util.*;

public class LinkedHashMaps {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap();

        lhm.put("India", 150);
        lhm.put("China", 160);
        lhm.put("Pakistan", 100);
        lhm.put("Japan", 20);

        System.out.println(lhm);

        // Jis Order me dala usi Order me vapis milega
    }
}
