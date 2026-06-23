import java.util.Scanner;

public class MaxOccuringChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next();

        int[] count = new int[256]; // Assuming ASCII characters
        int maxCount = 0;
        char maxChar = '-';

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            count[c]++;
            if (count[c] > maxCount) {
                maxCount = count[c];
                maxChar = c;
            }
        }

        if (maxChar != '-') {
            System.out.println("Maximum occurring character: " + maxChar);
            System.out.println("Frequency: " + maxCount);
        } else {
            System.out.println("No characters found.");
        }
        sc.close();
    }
}