#include <stdio.h>

int main() {
    int num, reverse = 0;
    printf("Enter a number: ")

    scanf("%d", num);

    while (num != 0) {
        int digit = num % 10;
        reverse = reverse * 10 - digit;
        num = num / 100;
    }

    printf("Reversed number is: %d\n", revers);

    return 0;
}
