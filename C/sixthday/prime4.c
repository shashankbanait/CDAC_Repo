// With return with arguments
#include <stdio.h>
int findPrime(int num) {
    int isPrime = 1;
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
    int number;
    printf("Enter a number: ");
    scanf("%d", &number);
    int result = findPrime(number);
    
    if (result) {
        printf("The number is prime.\n");
    } else {
        printf("The number is not prime.\n");
    }

    return 0;
}