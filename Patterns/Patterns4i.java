import java.util.*;

//Solid Full Pyramid

public class Patterns4i { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for(int row=0; row<n; row++){
            int k =0;
            for(int col=0; col<((2*n)-1);col++){
                if(col <n-row-1){
                    System.out.print(" ");
                }else if(k <((2*row)+1)){
                    System.out.print("*");
                    k++;
                } 
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // sc.close();
        

        // Nachiket Code

        int height = sc.nextInt(); // Height of the pyramid

        for (int i = 0; i < height; i++) {
            // Print spaces
            for (int j = i; j < height; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k <= (2 * i ); k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
        sc.close();
    }

    
}
