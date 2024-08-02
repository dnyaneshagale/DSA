import java.util.*;

//Hollow Square Pattern

public class Patterns2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        for(int rows =0; rows < n; rows ++){
            for(int col =0; col < n; col ++){
                if(rows==0 || rows==(n-1)|| col ==0 || col == (n-1)){ //Logic
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
