#include <stdio.h>

int main() {
    int n1, n2, temp1, temp2, rem, gcd, lcm;

    printf("Enter first number: ");
    scanf("%d", &n1);
    printf("Enter second number: ");
    scanf("%d", &n2);

    temp1 = n1;
    temp2 = n2;

    // Step 1: Find the GCD first
    while (temp2 != 0) {
        rem = temp1 % temp2;
        temp1 = temp2;
        temp2 = rem;
    }
    gcd = temp1;

    // Step 2: Use the standard mathematical formula: LCM = (n1 * n2) / GCD
    lcm = (n1 * n2) / gcd;

    printf("LCM of %d and %d is: %d\n", n1, n2, lcm);

    return 0;
}