import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int sum = 0;
        // Find proper divisors
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        
        if (sum == num && num > 0) {
            System.out.println(num + " is a Perfect number.");
        } else {
            System.out.println(num + " is NOT a Perfect number.");
        }
        sc.close();
    }
}