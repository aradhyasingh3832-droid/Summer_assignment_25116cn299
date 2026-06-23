import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String str = sc.next();
        
        int start = 0, end = str.length() - 1;
        boolean isPalin = true;
        
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalin = false;
                break;
            }
            start++;
            end--;
        }
        if(isPalin) System.out.println("The string is a Palindrome.");
        else System.out.println("The string is NOT a Palindrome.");
        sc.close();
    }
}