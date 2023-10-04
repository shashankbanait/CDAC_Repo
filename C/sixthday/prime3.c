// With return without arguments
#include <stdio.h>
int findPrime() {
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

    return isPrime;
}

int main() {
    int result = findPrime();
    
    if (result) {
        printf("The number is prime.\n");
    } else {
        printf("The number is not prime.\n");
    }

    return 0;
}