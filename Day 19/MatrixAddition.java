import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] m1 = new int[r][c];
        int[][] m2 = new int[r][c];
        
        System.out.println("First Matrix:");
        for(int i=0; i<r; i++) for(int j=0; j<c; j++) m1[i][j]=sc.nextInt();
        System.out.println("Second Matrix:");
        for(int i=0; i<r; i++) for(int j=0; j<c; j++) m2[i][j]=sc.nextInt();
        
        System.out.println("Resultant Sum Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print((m1[i][j] + m2[i][j]) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}