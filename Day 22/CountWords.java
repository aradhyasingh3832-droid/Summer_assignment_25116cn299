import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String str = sc.nextLine().trim();
        
        if (str.isEmpty()) {
            System.out.println("Word count: 0");
        } else {
            int words = 1;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                    words++;
                }
            }
            System.out.println("Word count: " + words);
        }
        sc.close();
    }
}