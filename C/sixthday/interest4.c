// With return with arguments
#include <stdio.h>
float calculateSimpleInterest(float principal, float rate, float time) {
    float interest = (principal * rate * time) / 100;
    return interest;
}

int main() {
    float p, r, t;
    printf("Enter principal amount: ");
    scanf("%f", &p);

    printf("Enter rate of interest: ");
    scanf("%f", &r);

    printf("Enter time period (in years): ");
    scanf("%f", &t);

    float result = calculateSimpleInterest(p, r, t);
    printf("Simple Interest: %.2f\n", result);
    return 0;
}
