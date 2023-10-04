// Without return without arguments
#include <stdio.h>
void checkArmstrong() {
    int num, original, remainder, result = 0;

    printf("Enter an integer: ");
    scanf("%d", &num);

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
    checkArmstrong();
    return 0;
}
