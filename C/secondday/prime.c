#include <stdio.h>
int isPrime(int n){
    for(int i=2; i*i<=n; i++){
        if(n%i==0){
            return 0;
        }
    }
    return 1;
}
int main(){
    int num1, num2;
    printf("Enter first\n");
    scanf("%d",&num1);
    printf("Enter second\n");
    scanf("%d", &num2);
    for(int i=num1; i<=num2; i++){
        if(isPrime(i)){
            printf("%d ", i);
        }
    }
}