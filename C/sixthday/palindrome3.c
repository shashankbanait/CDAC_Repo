// With return without arguments
#include <stdio.h>
int checkPalindrome() {
    int num, reversedNum = 0, originalNum, remainder;

    printf("Enter an integer: ");
    scanf("%d", &num);

    originalNum = num;

    while (num != 0) {
        remainder = num % 10;
        reversedNum = reversedNum * 10 + remainder;
        num /= 10;
    }

    return (originalNum == reversedNum);
}

int main() {
    int isPalindrome = checkPalindrome();

    if (isPalindrome) {
        printf("The number is a palindrome.\n");
    } else {
        printf("The number is not a palindrome.\n");
    }

    return 0;
}