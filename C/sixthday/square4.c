// With return with arguments
#include <stdio.h>
double findSquare(double num) {
    double answer = num * num;
    return answer;
}

int main() {
    double num, result;
    printf("Enter a number: ");
    scanf("%lf", &num);
    result = findSquare(num);
    printf("The square of %.2lf is %.2lf\n", num, result);
    return 0;
}
