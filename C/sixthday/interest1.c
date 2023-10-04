// Without return without arguments
#include <stdio.h>
void calculateSimpleInterest() {
    float principal, rate, time, interest;

    printf("Enter principal amount: ");
    scanf("%f", &principal);

    printf("Enter rate of interest: ");
    scanf("%f", &rate);

    printf("Enter time period (in years): ");
    scanf("%f", &time);

    interest = (principal * rate * time) / 100;

    printf("Simple Interest: %.2f\n", interest);
}

int main() {
    calculateSimpleInterest();
    return 0;
}
