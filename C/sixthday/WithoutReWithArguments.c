#include <stdio.h>

void add(int cdac1, int cdac2) {
    int answer = cdac1 + cdac2;
    printf("Sum: %d\n", answer);
}

int main() {
    int num1, num2;
    printf("Enter two numbers: ");
    scanf("%d %d", &num1, &num2);
    add(num1, num2);
    return 0;
}
