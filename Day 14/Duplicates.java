import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Duplicate elements found: ");
        boolean componentsFound = false;
        
        // Nested loop checking strategy to track matching pairs
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    // Check if we already printed it to avoid multi-printing the same duplicate
                    boolean alreadyPrinted = false;
                    for (int k = 0; k < i; k++) {
                        if (arr[k] == arr[i]) {
                            alreadyPrinted = true;
                            break;
                        }
                    }
                    if (!alreadyPrinted) {
                        System.out.print(arr[i] + " ");
                        componentsFound = true;
                    }
                    break;
                }
            }
        }
        
        if (!componentsFound) {
            System.out.print("None");
        }
        System.out.println();
        sc.close();
    }
}