import java.util.Scanner;

public class commonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        
        System.out.print("Common elements appearing elsewhere in array: ");
        boolean printedAny = false;
        for (int i = 0; i < n; i++) {
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) if (arr[k] == arr[i]) alreadyPrinted = true;
            if (alreadyPrinted) continue;
            
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    printedAny = true;
                    break;
                }
            }
        }
        if(!printedAny) System.out.print("None");
        System.out.println();
        sc.close();
    }
}