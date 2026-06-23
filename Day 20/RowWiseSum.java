import java.util.Scanner;

public class RowWiseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows and Columns: ");
        int r = sc.nextInt(); int c = sc.nextInt();
        int[][] mat = new int[r][c];
        
        for(int i=0; i<r; i++) {
            int rowSum = 0;
            System.out.println("Enter values for row " + i + ":");
            for(int j=0; j<c; j++) {
                mat[i][j] = sc.nextInt();
                rowSum += mat[i][j];
            }
            System.out.println("Sum of Row " + i + " = " + rowSum);
        }
        sc.close();
    }
}