import java.util.Scanner;

public class RecursiveFibonacci {
    // Recursive method to find the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) return 0; // Base case 1
        if (n == 1) return 1; // Base case 2
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms to print: ");
        int terms = sc.nextInt();

        System.out.print("Fibonacci Series up to " + terms + " terms: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        sc.close();
    }
}