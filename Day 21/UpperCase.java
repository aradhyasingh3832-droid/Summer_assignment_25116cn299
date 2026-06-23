import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lowercase text: ");
        String str = sc.nextLine();
        
        String upperStr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Deduct ascii conversion metrics manually
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            upperStr += ch;
        }
        System.out.println("Uppercase string: " + upperStr);
        sc.close();
    }
}