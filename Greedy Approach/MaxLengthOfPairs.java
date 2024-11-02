import java.util.*;

public class MaxLengthOfPairs {
    public static void main(String[] args) {
        int[][] pairs = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

        Arrays.sort(pairs, Comparator.comparingDouble(p -> p[1]));  // Last No. of pair is p[1]in array pairs[i][1];

        int chainLen = 1;
        int chainEnd = pairs[0][1];

        for(int i = 1; i < pairs.length; i++) {
            if(pairs[i][0] > chainEnd){
                chainLen++;
                chainEnd = pairs[i][0];
            }
        }

        System.out.println("Maximum Length Chain of Pairs : " +  chainLen);
    }    
}
