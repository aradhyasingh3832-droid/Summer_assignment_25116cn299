import java.util.Scanner;

public class FibonacciTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position (n): ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive position.");
        } else if (n == 1) {
            System.out.println("The 1st Fibonacci term is: 0");
        } else {
            int first = 0, second = 1;
            for (int i = 3; i <= n; i++) {
                int next = first + second;
                first = second;
                second = next;
            }
            System.out.println("The " + n + "th Fibonacci term is: " + second);
        }
        sc.close();
    }
}