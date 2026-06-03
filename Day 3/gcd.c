#include <stdio.h>

int main() {
    int n1, n2, temp1, temp2, rem;

    printf("Enter first number: ");
    scanf("%d", &n1);
    printf("Enter second number: ");
    scanf("%d", &n2);

    // Copy original numbers to temporary variables to keep originals safe
    temp1 = n1;
    temp2 = n2;

    // Euclidean Algorithm using a while loop
    while (temp2 != 0) {
        rem = temp1 % temp2;
        temp1 = temp2;
        temp2 = rem;
    }

    // After the loop finishes, temp1 holds the GCD
    printf("GCD of %d and %d is: %d\n", n1, n2, temp1);

    return 0;
}