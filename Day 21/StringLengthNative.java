import java.util.Scanner;

public class StringLengthNative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        
        int length = 0;
        try {
            // Loop until an out-of-bounds error naturally hits the terminal tail
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Tail reached
        }
        System.out.println("Length is: " + length);
        sc.close();
    }
}