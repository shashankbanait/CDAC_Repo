// Without return with arguments
#include <stdio.h>
void checkPalindrome(int num) {
    int reversedNum = 0, originalNum, remainder;

    originalNum = num;

    while (num != 0) {
        remainder = num % 10;
        reversedNum = reversedNum * 10 + remainder;
        num /= 10;
    }

    if (originalNum == reversedNum) {
        printf("%d is a palindrome.\n", originalNum);
    } else {
        printf("%d is not a palindrome.\n", originalNum);
    }
}

int main() {
    int number;
    printf("Enter an integer: ");
    scanf("%d", &number);
    checkPalindrome(number);
    return 0;
}
