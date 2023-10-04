#include <stdio.h>

int add(int cdac1, int cdac2) {
    int answer = cdac1 + cdac2;
    return answer;
}

int main() {
    int num1, num2;
    printf("Enter two numbers: ");
    scanf("%d %d", &num1, &num2);
    int result = add(num1, num2);
    printf("Sum: %d\n", result);
    return 0;
}