import java.util.Scanner;

public class FunctionSum {
    // Reusable function to calculate sum
    public static int findSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        
        System.out.println("Sum is: " + findSum(n1, n2));
        sc.close();
    }
}