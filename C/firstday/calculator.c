#include<stdio.h>
int main(){
    int a, b;
    char operator;
    printf("Please enter the operator: \n +,-,*,/");
    scanf("%c", &operator);
    printf("Enter first number: ");
    scanf("%d",&a);
    printf("Enter second number: ");
    scanf("%d",&b);

    switch (operator) {
    case '+':
      printf("%d + %d = %d", a,b,a+b);
      break;
    case '-':
      printf("%d - %d = %d", a,b,a-b);
      break;
    case '*':
      printf("%d * %d = %d", a,b,a*b);
      break;
    case '/':
      printf("%d / %d = %d", a,b,a/b);
      break;
    default:
      printf("Error! operator is not correct");
  }
}