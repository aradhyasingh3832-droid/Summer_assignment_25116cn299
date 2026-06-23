import java.util.Scanner;

public class IntersectionArrays {
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
        
        System.out.print("Intersection of arrays: ");
        for (int i = 0; i < n1; i++) {
            boolean duplicate = false;
            for(int k=0; k<i; k++) if(a1[k] == a1[i]) duplicate = true;
            if(duplicate) continue;
            
            for (int j = 0; j < n2; j++) {
                if (a1[i] == a2[j]) {
                    System.out.print(a1[i] + " ");
                    break;
                }
            }
        }
        System.out.println();
        sc.close();
    }
}