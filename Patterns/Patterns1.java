import java.util.*;

//Solid Square Pattern

public class Patterns1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();

        for(int rows=0;rows<N;rows++){
            for(int columns=0; columns<N; columns++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
