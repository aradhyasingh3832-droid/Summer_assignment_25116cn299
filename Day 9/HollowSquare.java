import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square side: ");
        int side = sc.nextInt();
        
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                // Print star only for borders
                if (i == 1 || i == side || j == 1 || j == side) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}