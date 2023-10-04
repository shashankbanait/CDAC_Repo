// With return with arguments
#include <stdio.h>

int checkPalindrome(int num) {
    int reversedNum = 0, originalNum, remainder;

    originalNum = num;

    while (num != 0) {
        remainder = num % 10;
        reversedNum = reversedNum * 10 + remainder;
        num /= 10;
    }

    return (originalNum == reversedNum);
}

int main() {
    int number;
    printf("Enter an integer: ");
    scanf("%d", &number);

    int isPalindrome = checkPalindrome(number);

    if (isPalindrome) {
        printf("The number is a palindrome.\n");
    } else {
        printf("The number is not a palindrome.\n");
    }

    return 0;
}