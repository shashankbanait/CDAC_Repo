// With return without arguments
#include <stdio.h>
int findFactorial() {
    int cdac1;
    printf("Enter a number: ");
    scanf("%d", &cdac1);
    
    int answer = 1;
    for (int i = 1; i <= cdac1; i++) {
        answer *= i;
    }
    
    return answer;
}

int main() {
    int result = findFactorial();
    printf("Factorial: %d\n", result);
    return 0;
}