import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        String[] arr = new String[N];

        for(int i = 0; i<arr.length; i++){
            arr[i]=scn.next();
        }
        

        String target = scn.next();

        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    public static int linearSearch(String[] arr, String target) {
        for(int i = 0; i < arr.length; i++) {
            /*if(arr[i] == target) {
                return i;
            }
            */
            if (arr[i].equals(target)) {  // Use equals() to compare strings
                return i;
            }
        }
        return -1;
    }
}
