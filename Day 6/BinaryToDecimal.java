import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        long binary = sc.nextLong();
        
        long temp = binary;
        int decimal = 0;
        int base = 1; // Represents 2^0
        boolean isValid = true;
        
        while (temp > 0) {
            long lastDigit = temp % 10;
            if (lastDigit != 0 && lastDigit != 1) {
                isValid = false;
                break;
            }
            decimal += lastDigit * base;
            base = base * 2;
            temp /= 10;
        }
        
        if (!isValid) {
            System.out.println("Invalid binary input! Only 0s and 1s allowed.");
        } else {
            System.out.println("Decimal equivalent of " + binary + " is: " + decimal);
        }
        sc.close();
    }
}