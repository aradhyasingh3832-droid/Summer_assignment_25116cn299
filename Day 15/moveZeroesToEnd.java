import java.util.Scanner;

public class moveZeroesToEnd {
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

        // Use two pointers to move non-zero elements to the front
        int writeIndex = 0;
        for (int readIndex = 0; readIndex < n; readIndex++) {
            if (arr[readIndex] != 0) {
                arr[writeIndex] = arr[readIndex];
                writeIndex++;
            }
        }

        // Fill the remaining positions with zeros
        while (writeIndex < n) {
            arr[writeIndex] = 0;
            writeIndex++;
        }

        System.out.print("Array after moving zeros to end: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}