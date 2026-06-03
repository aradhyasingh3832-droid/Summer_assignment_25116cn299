#include <stdio.h>
#include <stdlib.h>

int main() {
    int num, sum = 0, rem, temp;

    printf("Enter a number: ");
    scanf("%d", &num);

    // Using absolute value to handle negative numbers correctly
    temp = abs(num); 

    while (temp > 0) {
        rem = temp % 10;
        sum = sum + rem;
        temp = temp / 10;
    }

    printf("Sum of digits of %d is: %d\n", num, sum);
    return 0;
}