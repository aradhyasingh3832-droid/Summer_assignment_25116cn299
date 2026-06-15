import java.util.Scanner;

public class ElementFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter element to find its frequency count: ");
        int target = sc.nextInt();
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        
        System.out.println("The element " + target + " occurs " + count + " times.");
        sc.close();
    }
}