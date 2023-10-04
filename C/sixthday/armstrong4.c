// With return with arguments
#include <stdio.h>

int checkArmstrong(int num) {
    int original, remainder, result = 0;

    original = num;

    while (original != 0) {
        remainder = original % 10;
        result += remainder * remainder * remainder;
        original /= 10;
    }

    return (result == num);
}

int main() {
    int number;
    printf("Enter an integer: ");
    scanf("%d", &number);

    int isArmstrong = checkArmstrong(number);

    if (isArmstrong) {
        printf("The number is an Armstrong number.\n");
    } else {
        printf("The number is not an Armstrong number.\n");
    }

    return 0;
}