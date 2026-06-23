import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows and Cols of Matrix 1: ");
        int r1 = sc.nextInt(); int c1 = sc.nextInt();
        System.out.print("Rows and Cols of Matrix 2: ");
        int r2 = sc.nextInt(); int c2 = sc.nextInt();
        
        if (c1 != r2) {
            System.out.println("Multiplication not valid with these bounds.");
            sc.close(); return;
        }
        
        int[][] m1 = new int[r1][c1];
        int[][] m2 = new int[r2][c2];
        int[][] res = new int[r1][c2];
        
        System.out.println("Matrix 1 entries:");
        for(int i=0; i<r1; i++) for(int j=0; j<c1; j++) m1[i][j]=sc.nextInt();
        System.out.println("Matrix 2 entries:");
        for(int i=0; i<r2; i++) for(int j=0; j<c2; j++) m2[i][j]=sc.nextInt();
        
        System.out.println("Resulting Product Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    res[i][j] += m1[i][k] * m2[k][j];
                }
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}