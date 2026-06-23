import java.util.Scanner;

public class ColumnWiseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows and Columns: ");
        int r = sc.nextInt(); int c = sc.nextInt();
        int[][] mat = new int[r][c];
        
        System.out.println("Enter complete matrix:");
        for(int i=0; i<r; i++) for(int j=0; j<c; j++) mat[i][j]=sc.nextInt();
        
        for (int j = 0; j < c; j++) {
            int colSum = 0;
            for (int i = 0; i < r; i++) {
                colSum += mat[i][j];
            }
            System.out.println("Sum of Column " + j + " = " + colSum);
        }
        sc.close();
    }
}