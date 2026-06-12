import java.util.Scanner;

public class FunctionPerfect {
    public static boolean isPerfect(int n) {
        if (n <= 1) return false;
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isPerfect(num)) {
            System.out.println(num + " is a Perfect number.");
        } else {
            System.out.println(num + " is NOT a Perfect number.");
        }
        sc.close();
    }
}