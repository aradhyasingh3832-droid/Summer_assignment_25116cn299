import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        
        int temp1 = Math.abs(n1);
        int temp2 = Math.abs(n2);
        
        // Find GCD first
        while (temp2 != 0) {
            int rem = temp1 % temp2;
            temp1 = temp2;
            temp2 = rem;
        }
        int gcd = temp1;
        
        // LCM formula: (a * b) / GCD
        int lcm = (Math.abs(n1) * Math.abs(n2)) / gcd;
        
        System.out.println("LCM of " + n1 + " and " + n2 + " is: " + lcm);
        sc.close();
    }
}