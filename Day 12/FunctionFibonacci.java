import java.util.Scanner;

public class FunctionFibonacci {
    public static int getNthFibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 0;
        if (n == 2) return 1;
        
        int first = 0, second = 1, current = 0;
        for (int i = 3; i <= n; i++) {
            current = first + second;
            first = second;
            second = current;
        }
        return current;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position (n): ");
        int n = sc.nextInt();
        
        System.out.println("The " + n + "th Fibonacci term is: " + getNthFibonacci(n));
        sc.close();
    }
}