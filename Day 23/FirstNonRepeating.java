import java.util.Scanner;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next();
        
        char result = '-';
        for (int i = 0; i < str.length(); i++) {
            boolean repeated = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                result = str.charAt(i);
                break;
            }
        }
        if(result != '-') System.out.println("First non-repeating character: " + result);
        else System.out.println("All characters repeat.");
        sc.close();
    }
}