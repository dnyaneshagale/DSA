import java.util.*;
public class IndianCoins {
    public static void main(String[] args) {
        Integer[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

        Arrays.sort(coins, Comparator.reverseOrder());
        Scanner scn = new Scanner(System.in);
        int count = 0;
        int amount = scn.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < coins.length; i++){
            while(coins[i] <= amount){
                if(coins[i] <= amount){
                    count++;
                    amount-=coins[i];
                    list.add(coins[i]);
                }
            }
        }
        System.out.println("Tera Answer hai : " + count);

        System.out.println(list);
    }
}
