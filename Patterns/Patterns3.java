import java.util.*; 

//Hollow Inverted Half Pyramid

public class Patterns3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int row =0; row < n; row ++){
        for(int col = 0 ; col < n; col ++){
            if(row==0||col==0||col==n-row-1){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }System.out.println();
    }
}
}
