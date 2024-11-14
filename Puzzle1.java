
import java.util.Arrays;
import java.util.Scanner;

public class Puzzle1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Emter the dimention: ");
        int row =scanner.nextInt();
        int col=scanner.nextInt();
        
        System.out.print("Enter the Adventurer Position: ");
        
        

        int startRow=scanner.nextInt();
        int startCol=scanner.nextInt();

        int dp[][]=calculateMoves(row,col,startRow,startCol);
        

        System.out.print("Enter the Gold Position: ");

        int gRow=scanner.nextInt();
        int gCol=scanner.nextInt();

        System.out.println(dp[gRow][gCol]);



        //System.out.println(Arrays.toString(a));
    }

    static int[][] calculateMoves(int rows, int columns, int startRow, int startCol) {
        int[][] movesArray = new int[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                
                movesArray[i][j] = Math.abs(i - startRow) + Math.abs(j - startCol);
            }
        }
        
        return movesArray;
    }
}