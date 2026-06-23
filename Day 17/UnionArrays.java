import java.util.Scanner;

public class UnionArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array 1: ");
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for(int i=0; i<n1; i++) a1[i] = sc.nextInt();
        
        System.out.print("Size of Array 2: ");
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for(int i=0; i<n2; i++) a2[i] = sc.nextInt();
        
        System.out.print("Union of arrays: ");
        for (int i = 0; i < n1; i++) {
            boolean printed = false;
            for(int k=0; k<i; k++) if(a1[k] == a1[i]) printed = true;
            if(!printed) System.out.print(a1[i] + " ");
        }
        for (int i = 0; i < n2; i++) {
            boolean exists = false;
            for (int j = 0; j < n1; j++) if (a2[i] == a1[j]) exists = true;
            for (int k = 0; k < i; k++) if (a2[k] == a2[i]) exists = true;
            if (!exists) System.out.print(a2[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}