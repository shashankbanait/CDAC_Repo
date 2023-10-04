#include<stdio.h>
int main(){
    int a;
    scanf("%d", &a);
    if((a%8==0) && (a%5==0)){
        printf("divisible by 8 and 5");
    }
    else if(a%8==0){
        printf("divisible by 8");
    }
    else if(a%8==0){
        printf("divisible by 5");
    }
    else if(((a%8)!=0) && ((a%5)!=0)){
        printf("Not divisible by 8 and 5");
    }
}