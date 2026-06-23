import java.util.Scanner;

public class RemoveDuplicateChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string text: ");
        String str = sc.next();
        
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            String ch = String.valueOf(str.charAt(i));
            if (!result.contains(ch)) {
                result += ch;
            }
        }
        System.out.println("String after removing duplicates: " + result);
        sc.close();
    }
}