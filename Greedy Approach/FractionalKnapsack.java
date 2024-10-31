import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int W = 50; //CAPACITY of SACK

        double[][] ratio = new double[val.length][2];

        for(int i = 0; i < val.length; i++) {
            ratio[i][0] = i; //Indexes
            ratio[i][1] = val[i]/(double)weight[i]; //Ratio Stored
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int maxVal = 0;

        for(int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]) {
                maxVal += val[idx];
                capacity -= weight[idx];
            } else {
                maxVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println("The Maximum Value is : " + maxVal);
    }
}
