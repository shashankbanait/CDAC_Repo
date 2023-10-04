// Without return with arguments
#include <stdio.h>

void findEvenOdd(int even) {
    if (even % 2 == 0) {
        printf("%d is even.\n", even);
    } else {
        printf("%d is odd.\n", even);
    }
}

int main() {
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);
    findEvenOdd(num);
    return 0;
}
