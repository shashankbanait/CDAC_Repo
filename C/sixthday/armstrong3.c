// With return without arguments
#include <stdio.h>

int checkArmstrong() {
    int num, original, remainder, result = 0;

    printf("Enter an integer: ");
    scanf("%d", &num);

    original = num;

    while (original != 0) {
        remainder = original % 10;
        result += remainder * remainder * remainder;
        original /= 10;
    }

    return (result == num);
}

int main() {
    int isArmstrong = checkArmstrong();

    if (isArmstrong) {
        printf("The number is an Armstrong number.\n");
    } else {
        printf("The number is not an Armstrong number.\n");
    }

    return 0;
}