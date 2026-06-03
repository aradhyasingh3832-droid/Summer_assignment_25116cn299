import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower limit: ");
        int lower = sc.nextInt();
        System.out.print("Enter upper limit: ");
        int upper = sc.nextInt();
        
        System.out.println("Prime numbers between " + lower + " and " + upper + " are:");
        
        for (int i = lower; i <= upper; i++) {
            if (i <= 1) continue;
            
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}