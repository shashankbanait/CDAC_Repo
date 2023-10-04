// #include<stdio.h>

// int sub(int a, int b){
//     for(int i=0;i)
//     return b;
// }

// int main(){
//     int num1, num2;
//     scanf("%d%d",&num1,&num2);
//     printf("%d", sub(num1,num2));
// }

#include <stdio.h>
#include <stdlib.h>
int main(){
    int a = 4;
    int b = 6;
    if(a==b){
        return 0;
    }
    if(a>b){
        for(int i=0; i<a; i++){
            b--;
        }
        printf("%d", abs(b));
        
    }
    if(a<b){
        for(int i=0; i<b; i++){
            a--;
        }
        printf("%d", abs(a));
    }
}