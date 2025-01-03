import java.util.*;

public class HmIntro{
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        /*keys ko set kiya hm.put() fxn se */
        hm.put("India", 135);       //Keys ko set kia
        hm.put("China", 200);
        hm.put("Pakistan", 40);
        hm.put("US", 20);
        hm.put("UK", 15);           
        System.out.println(hm);

        //Update karenge same fxn se->
        hm.put("US", 25);
        System.out.println(hm);

        //Values ko fetch karenge hm.get() se ||
        System.out.println(hm.get("India")); 
        System.out.println(hm.get("US"));


        //Koi Key Exist karti hai ya nahi ye Check karenge
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Utopia"));


        //Saari Keys ko print kaise karenge
        Set <String> keys = hm.keySet();
        System.out.println(keys);

        //Saari keys ko value ke sath karenge
        for(String key : hm.keySet()){
            Integer val = hm.get(key);
            System.out.println(key + " " + val);
        }

    }
}