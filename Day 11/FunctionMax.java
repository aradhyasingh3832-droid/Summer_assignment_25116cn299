import java.util.Scanner;

public class FunctionMax {
    // Reusable function to find max
    public static int findMax(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        
        System.out.println("Maximum value is: " + findMax(n1, n2));
        sc.close();
    }
}