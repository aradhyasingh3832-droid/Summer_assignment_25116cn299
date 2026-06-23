import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array 1: ");
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        System.out.println("Elements for Array 1:");
        for(int i=0; i<n1; i++) a1[i] = sc.nextInt();
        
        System.out.print("Size of Array 2: ");
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        System.out.println("Elements for Array 2:");
        for(int i=0; i<n2; i++) a2[i] = sc.nextInt();
        
        int[] merged = new int[n1 + n2];
        for(int i=0; i<n1; i++) merged[i] = a1[i];
        for(int i=0; i<n2; i++) merged[n1 + i] = a2[i];
        
        System.out.print("Merged Array: ");
        for(int val : merged) System.out.print(val + " ");
        System.out.println();
        sc.close();
    }
}