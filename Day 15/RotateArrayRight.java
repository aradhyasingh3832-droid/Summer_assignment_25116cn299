import java.util.Scanner;

public class RotateArrayRight {
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
        
        // Store last element safely
        int last = arr[n - 1];
        // Shift items rightward from tail to head
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        // Place original last item at front index
        arr[0] = last;
        
        System.out.print("Array after right rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}