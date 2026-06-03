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

    if (num == reversed) {
        printf("%d is a Palindrome number.\n", num);
    } else {
        printf("%d is NOT a Palindrome number.\n", num);
    }

    return 0;
}