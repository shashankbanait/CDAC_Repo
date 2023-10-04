// With return without arguments
#include <stdio.h>
float calculateSimpleInterest() {
    float principal, rate, time, interest;

    printf("Enter principal amount: ");
    scanf("%f", &principal);

    printf("Enter rate of interest: ");
    scanf("%f", &rate);

    printf("Enter time period (in years): ");
    scanf("%f", &time);

    interest = (principal * rate * time) / 100;

    return interest;
}

int main() {
    float result = calculateSimpleInterest();
    printf("Simple Interest: %.2f\n", result);
    return 0;
}