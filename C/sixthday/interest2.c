// Without return with arguments
#include <stdio.h>
void calculateSimpleInterest(float principal, float rate, float time) {
    float interest = (principal * rate * time) / 100;
    printf("Simple Interest: %.2f\n", interest);
}

int main() {
    float p, r, t;
    printf("Enter principal amount: ");
    scanf("%f", &p);

    printf("Enter rate of interest: ");
    scanf("%f", &r);

    printf("Enter time period (in years): ");
    scanf("%f", &t);

    calculateSimpleInterest(p, r, t);
    return 0;
}
