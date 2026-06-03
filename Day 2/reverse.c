#include <stdio.h>

int main() {
    int num, reversed = 0, rem, temp;

    printf("Enter a number: ");
    scanf("%d", &num);

    temp = num;
    while (temp != 0) {
        rem = temp % 10;
        reversed = reversed * 10 + rem;
        temp = temp / 10;
    }

    printf("Reverse of %d is: %d\n", num, reversed);
    return 0;
}