// With return with arguments
#include <stdio.h>
int findFactorial(int cdac1) {
    int answer = 1;
    for (int i = 1; i <= cdac1; i++) {
        answer *= i;
    }
    
    return answer;
}

int main() {
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);
    int result = findFactorial(num);
    printf("Factorial: %d\n", result);
    return 0;
}