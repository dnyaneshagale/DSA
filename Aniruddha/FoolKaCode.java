package Aniruddha;

import java.util.HashMap;

public class FoolKaCode {
    public static boolean isAvailable(int[] colours) {
        
        HashMap<Integer, Integer> colorCount = new HashMap<>();
        for (int colour : colours) {
            colorCount.put(colour, colorCount.getOrDefault(colour, 0) + 1);
        }
        
        int totalFlowers = colours.length;

        
        int maxColorCount = 0;
        for (int count : colorCount.values()) {
            if (count > maxColorCount) {
                maxColorCount = count;
            }
        }

        boolean ans =  false;
        if((totalFlowers - maxColorCount) >= maxColorCount){
            ans = true;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1};

        System.out.println(isAvailable(arr));
    }
}
