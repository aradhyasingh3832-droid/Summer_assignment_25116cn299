import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int temp = num;
        int count = 0;
        
        while (temp > 0) {
            // Check if the last binary digit is 1
            if ((temp % 2) == 1) {
                count++;
            }
            temp /= 2;
        }
        
        System.out.println("Number of set bits (1s) in " + num + " is: " + count);
        sc.close();
    }
}