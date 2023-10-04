// Without return with argumennts
#include <stdio.h>
void checkArmstrong(int num) {
    int original, remainder, result = 0;

    original = num;

    while (original != 0) {
        remainder = original % 10;
        result += remainder * remainder * remainder;
        original /= 10;
    }

    if (result == num) {
        printf("%d is an Armstrong number.\n", num);
    } else {
        printf("%d is not an Armstrong number.\n", num);
    }
}

int main() {
    int number;
    printf("Enter an integer: ");
    scanf("%d", &number);
    checkArmstrong(number);
    return 0;
}
