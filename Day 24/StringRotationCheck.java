import java.util.Scanner;

public class StringRotationCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Original String: ");
        String org = sc.next();
        System.out.print("Check Rotation String: ");
        String rot = sc.next();
        
        if (org.length() != rot.length()) {
            System.out.println("Not a valid rotation.");
        } else {
            String combined = org + org;
            if (combined.contains(rot)) {
                System.out.println("Yes, it is a valid rotated string sequence.");
            } else {
                System.out.println("No, not a rotation match.");
            }
        }
        sc.close();
    }
}