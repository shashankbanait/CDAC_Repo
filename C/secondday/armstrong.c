#include<stdio.h>
int main(){
    int num = 153, sum, rem, multi;
    int temp = num;
    while(temp!=0){
        rem = temp % 10;
        multi = rem * rem * rem;
        sum = sum + multi;
        temp = temp / 10;
    }
    if(sum == num){
        printf("Yes this is armstrong");
    }
    else{
        printf("No it's not armstrong");
    }
}