import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int temp = num;
        int digits = 0;
        int sum = 0;
        
        // Count number of digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        
        temp = num;
        // Calculate sum of digits raised to power of total digits
        while (temp > 0) {
            int remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp /= 10;
        }
        
        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }
        sc.close();
    }
}