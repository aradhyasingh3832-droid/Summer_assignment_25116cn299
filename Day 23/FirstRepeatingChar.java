import java.util.Scanner;

public class FirstRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next();
        
        char result = '-';
        for (int i = 0; i < str.length(); i++) {
            boolean found = false;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    result = str.charAt(i);
                    found = true;
                    break;
                }
            }
            if(found) break;
        }
        if(result != '-') System.out.println("First repeating character: " + result);
        else System.out.println("No repeating characters found.");
        sc.close();
    }
}