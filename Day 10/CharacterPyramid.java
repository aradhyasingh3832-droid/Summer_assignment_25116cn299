import java.util.Scanner;

public class CharacterPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print increasing characters
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            // Print decreasing characters
            ch -= 2;
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }
        sc.close();
    }
}