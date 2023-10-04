// WAP 
#include<stdio.h>
int main(){
    int a, b;
    scanf("%d", &a);
    if(a>=1500){
        printf("The amount after discount is: %d ", (a-200));
    }
    else{
        printf("You are not eligible for discount 1500");
    }
}