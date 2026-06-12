
import java.util.Scanner;

public class FunctionFactorial {
    // Reusable function to compute factorial
    public static long calculateFactorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (num < 0) {
            System.out.println("Factorial undefined for negative numbers.");
        } else {
            System.out.println("Factorial of " + num + " is: " + calculateFactorial(num));
        }
        sc.close();
    }
}
