#include <stdio.h>

void add() {
    int cdac1, cdac2;
    printf("Enter two numbers: ");
    scanf("%d %d", &cdac1, &cdac2);
    int answer = cdac1 + cdac2;
    printf("Sum: %d\n", answer);
}

int main() {
    add();
    return 0;
}
