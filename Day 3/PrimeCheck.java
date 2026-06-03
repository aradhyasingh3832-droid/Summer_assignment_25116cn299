import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int isPrime = 1; // 1 means true, 0 means false
        
        if (num <= 1) {
            isPrime = 0;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = 0; 
                    break;
                }
            }
        }
        
        if (isPrime == 1) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is NOT a prime number.");
        }
        sc.close();
    }
}