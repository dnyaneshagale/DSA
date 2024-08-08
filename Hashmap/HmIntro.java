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

        //Update karenge same fxn se->
        hm.put("US", 25);

        //Values ko fetch karenge hm.get() se ||
        hm.get("India");   
        hm.get("US");

        //Koi Key Exist karti hai ya nahi ye Check karenge
        hm.containsKey("India");
        hm.containsKey("Utopia");


        //Saari Keys ko print kaise karenge

    }
}