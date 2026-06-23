import java.util.Scanner;

public class MaxFrequencyElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        int maxElement = arr[0];
        int maxCount = 0;
        
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxElement = arr[i];
            }
        }
        System.out.println("Element with max frequency: " + maxElement + " (Occurs " + maxCount + " times)");
        sc.close();
    }
}