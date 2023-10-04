// WAP to print prime number in the array
#include <stdio.h>

int isPrime(int n) {
    if (n <= 1) return 0;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) return 0;
    }
    return 1;
}

int main() {
    int arr[] = {2, 3, 7, 9, 11, 15, 17, 19};
    int size = sizeof(arr) / sizeof(arr[0]);

    printf("Prime numbers in the array: ");

    for (int i = 0; i < size; i++) {
        if (isPrime(arr[i])) {
            printf("%d ", arr[i]);
        }
    }

    printf("\n");

    return 0;
}
