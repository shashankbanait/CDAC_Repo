// With return with argument
#include <stdio.h>
char* findEvenOdd() {
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);

    if (num % 2 == 0) {
        return "even";
    } else {
        return "odd";
    }
}

int main() {
    char* result = findEvenOdd();
    printf("The number is %s.\n", result);
    return 0;
}