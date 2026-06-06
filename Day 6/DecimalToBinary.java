import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        
        if (decimal == 0) {
            System.out.println("Binary equivalent: 0");
        } else {
            String binary = "";
            int temp = decimal;
            
            while (temp > 0) {
                int rem = temp % 2;
                binary = rem + binary; // Append remainder to the front
                temp /= 2;
            }
            System.out.println("Binary equivalent of " + decimal + " is: " + binary);
        }
        sc.close();
    }
}