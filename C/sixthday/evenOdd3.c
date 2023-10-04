// With return without Argument
#include <stdio.h>

char* findEvenOdd() {
    int even;

    printf("Enter a number: ");
    scanf("%d", &even);

    if (even % 2 == 0) {
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