import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
        if (n == 0) {
            sc.close();
            return;
        }
        
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Store first element safely
        int first = arr[0];
        // Shift remaining items leftward
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        // Move first element back to the end
        arr[n - 1] = first;
        
        System.out.print("Array after left rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}