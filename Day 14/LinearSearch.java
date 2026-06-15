import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the element to search for: ");
        int key = sc.nextInt();
        int index = -1;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                index = i;
                break; // Element found, exit loop
            }
        }
        
        if (index != -1) {
            System.out.println("Element found at index position: " + index);
        } else {
            System.out.println("Element not present in the array.");
        }
        sc.close();
    }
}