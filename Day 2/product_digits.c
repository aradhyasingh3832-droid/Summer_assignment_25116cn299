#include <stdio.h>
#include <stdlib.h>

int main() {
    int num, product = 1, rem, temp;

    printf("Enter a number: ");
    scanf("%d", &num);

    if (num == 0) {
        product = 0;
    } else {
        temp = abs(num);
        while (temp > 0) {
            rem = temp % 10;
            product = product * rem;
            temp = temp / 10;
        }
    }

    printf("Product of digits of %d is: %d\n", num, product);
    return 0;
}