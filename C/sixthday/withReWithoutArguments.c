#include <stdio.h>

int add() {
    int cdac1, cdac2;
    printf("Enter two numbers: ");
    scanf("%d %d", &cdac1, &cdac2);
    int answer = cdac1 + cdac2;
    return answer;
}

int main() {
    int result = add();
    printf("Sum: %d\n", result);
    return 0;
}