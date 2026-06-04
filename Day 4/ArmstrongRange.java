import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower limit: ");
        int lower = sc.nextInt();
        System.out.print("Enter upper limit: ");
        int upper = sc.nextInt();
        
        System.out.println("Armstrong numbers between " + lower + " and " + upper + " are:");
        
        for (int i = lower; i <= upper; i++) {
            int num = i;
            int digits = 0;
            int sum = 0;
            
            // Count digits
            int temp = num;
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
            
            // Check Armstrong criteria
            temp = num;
            while (temp > 0) {
                int remainder = temp % 10;
                sum += Math.pow(remainder, digits);
                temp /= 10;
            }
            
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}