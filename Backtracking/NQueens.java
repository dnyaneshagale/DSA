import java.util.*;

public class NQueens{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        boolean[][] board = new boolean[n][n];

        boolean[] cols = new boolean[n];
        boolean[] ndiag = new boolean[2*n - 1];  //Noraml Diagonal's Array
        boolean[] rdiag = new boolean[2*n -1];  //Reverse Diagonal's Array
        solve(board, 0, cols, ndiag, rdiag, "");
    }

    public static void solve(boolean[][] board, int row, boolean[] cols, boolean[] ndiag, boolean[] rdiag, String asf) {
        if(row == board.length){
            System.out.println(asf+".");
            return;
        }

        for(int col =0; col < board[0].length; col++){
            if(cols[col]==false && ndiag[row+col]==false && rdiag[row-col+board.length-1]==false){
                board[row][col]=true;
                cols[col]=true;
                ndiag[row + col]=true;
                rdiag[row - col + board.length - 1]=true;

                solve(board, row+1, cols, ndiag, rdiag, asf + row + " - " + col + " , ");

                board[row][col]= false;
                cols[col]= false;
                ndiag[row + col]= false;
                rdiag[row - col + board.length - 1]= false;
            }
        }
    }
}