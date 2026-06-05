import java.util.Scanner;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int temp = num;
        int maxPrimeFactor = -1;
        
        // Divide out the factors of 2
        while (temp % 2 == 0) {
            maxPrimeFactor = 2;
            temp /= 2;
        }
        
        // Look for odd prime factors
        for (int i = 3; i <= Math.sqrt(temp); i += 2) {
            while (temp % i == 0) {
                maxPrimeFactor = i;
                temp /= i;
            }
        }
        
        // If the remaining number is prime and greater than 2
        if (temp > 2) {
            maxPrimeFactor = temp;
        }
        
        if (maxPrimeFactor == -1) {
            System.out.println("No prime factors found.");
        } else {
            System.out.println("The largest prime factor of " + num + " is: " + maxPrimeFactor);
        }
        sc.close();
    }
}