import java.util.Scanner;
import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String 1: ");
        String s1 = sc.next().toLowerCase();
        System.out.print("String 2: ");
        String s2 = sc.next().toLowerCase();
        
        if (s1.length() != s2.length()) {
            System.out.println("Not an Anagram (Lengths differ).");
        } else {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            
            if (Arrays.equals(c1, c2)) System.out.println("Strings are Anagrams.");
            else System.out.println("Strings are NOT Anagrams.");
        }
        sc.close();
    }
}