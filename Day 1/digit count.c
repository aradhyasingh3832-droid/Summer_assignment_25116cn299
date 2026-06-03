#include <stdio.h>

int main() {
    int num, count = 0;
    
    printf("Enter an integer: ");
    scanf("%d", &num);

    int originalNum = num;
    
    // Handle negative numbers by converting to positive
    if (num < 0) {
        num = -num; 
    }

    // Special case for 0
    if (num == 0) {
        count = 1;
    } else {
        while (num > 0) {
            num = num / 10; // Removes the last digit
            count++;        // Increments digit counter
        }
    }

    printf("Number of digits in %d is: %d\n", originalNum, count);
    return 0;
}