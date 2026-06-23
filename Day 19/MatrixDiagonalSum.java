import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix (n): ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        
        System.out.println("Enter matrix values:");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
                if (i == j) sum += mat[i][j];
            }
        }
        System.out.println("Principal Diagonal Sum is: " + sum);
        sc.close();
    }
}