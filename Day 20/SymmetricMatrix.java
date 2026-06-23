import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of square matrix: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        
        for(int i=0; i<n; i++) for(int j=0; j<n; j++) mat[i][j]=sc.nextInt();
        
        boolean isSymmetric = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != mat[j][i]) { isSymmetric = false; break; }
            }
        }
        if(isSymmetric) System.out.println("The matrix is Symmetric.");
        else System.out.println("The matrix is NOT Symmetric.");
        sc.close();
    }
}