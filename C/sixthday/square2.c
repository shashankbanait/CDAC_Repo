// Without return with arguments
#include <stdio.h>
void findSquare(double num) {
    double answer = num * num;
    printf("The square of %.2lf is %.2lf\n", num, answer);
}

int main() {
    double num;
    printf("Enter a number: ");
    scanf("%lf", &num);
    findSquare(num);
    return 0;
}