// without return without arguments
#include <stdio.h>

void findFactorial() {
    int cdac1;
    printf("Enter a number: ");
    scanf("%d", &cdac1);
    
    int answer = 1;
    for (int i = 1; i <= cdac1; i++) {
        answer *= i;
    }
    
    printf("Factorial: %d\n", answer);
}

int main() {
    findFactorial();
    return 0;
}
