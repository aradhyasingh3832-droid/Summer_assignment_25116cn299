import java.util.Scanner;

public class RecursiveReverse {
    // Helper recursive method to reverse digits
    public static void reverse(int n) {
        if (n < 10) {
            System.out.print(n); // Base case: last remaining digit
            return;
        }
        System.out.print(n % 10); // Print last digit
        reverse(n / 10); // Recursive call with remaining digits
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt();

        System.out.print("Reversed number: ");
        if (num < 0) {
            System.out.print("-");
            reverse(Math.abs(num));
        } else if (num == 0) {
            System.out.print(0);
        } else {
            reverse(num);
        }
        System.out.println();
        sc.close();
    }
}