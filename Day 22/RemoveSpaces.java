import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter spaced string: ");
        String str = sc.nextLine();
        
        String cleanStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && str.charAt(i) != '\t') {
                cleanStr += str.charAt(i);
            }
        }
        System.out.println("Cleaned outcome: " + cleanStr);
        sc.close();
    }
}