// Without return without arguments
#include <stdio.h>

void findSquare() {
    double num, answer;

    printf("Enter a number: ");
    scanf("%lf", &num);

    answer = num * num;

    printf("The square of %.2lf is %.2lf\n", num, answer);
}

int main() {
    findSquare();
    return 0;
}
