import java.util.*;

//Hollow Full Pyramid

public class Patterns4ii { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int row=0; row<n; row++){
            int k =0;
            for(int col=0; col< ((2*n)-1); col++){
                if(col<n-row-1){
                    System.out.print(" ");
                }else if(k<((2*row)+1)){
                    if(k==0 || k==2*row || row==n-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                    k++;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
