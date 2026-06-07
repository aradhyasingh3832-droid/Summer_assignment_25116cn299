import java.util.Scanner;

public class RecursiveSumDigits {
    // Recursive method to sum the digits
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0; // Base case
        }
        return (n % 10) + sumOfDigits(n / 10); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Use Math.abs to handle negative numbers correctly
        int result = sumOfDigits(Math.abs(num));
        System.out.println("Sum of digits of " + num + " is: " + result);
        sc.close();
    }
}