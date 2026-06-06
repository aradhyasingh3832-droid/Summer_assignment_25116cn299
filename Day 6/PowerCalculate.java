import java.util.Scanner;

public class PowerCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (x): ");
        double x = sc.nextDouble();
        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();
        
        double result = 1.0;
        int absoluteN = Math.abs(n);
        
        // Loop to multiply base n times
        for (int i = 1; i <= absoluteN; i++) {
            result *= x;
        }
        
        // Handle negative exponents (e.g., x^-n = 1 / x^n)
        if (n < 0) {
            result = 1.0 / result;
        }
        
        System.out.println(x + " raised to the power of " + n + " is: " + result);
        sc.close();
    }
}