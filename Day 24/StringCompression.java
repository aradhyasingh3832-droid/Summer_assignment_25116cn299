import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter raw uncompressed word (e.g. aabcccccaaa): ");
        String str = sc.next();
        
        String compressed = "";
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            count++;
            // If next character is different or tail is met, append
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed += str.charAt(i) + "" + count;
                count = 0;
            }
        }
        System.out.println("Compressed format: " + compressed);
        sc.close();
    }
}