import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        
        int temp1 = Math.abs(n1);
        int temp2 = Math.abs(n2);
        
        // Euclidean Algorithm
        while (temp2 != 0) {
            int rem = temp1 % temp2;
            temp1 = temp2;
            temp2 = rem;
        }
        
        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + temp1);
        sc.close();
    }
}