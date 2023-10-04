// Without return without argument
#include <stdio.h>

void findPrime() {
    int num, isPrime = 1;

    printf("Enter a number: ");
    scanf("%d", &num);

    if (num <= 1) {
        isPrime = 0;
    } else {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = 0;
                break;
            }
        }
    }

    if (isPrime) {
        printf("%d is prime.\n", num);
    } else {
        printf("%d is not prime.\n", num);
    }
}

int main() {
    findPrime();
    return 0;
}
