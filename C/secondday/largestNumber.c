#include<stdio.h>
int main(){
    int a, b, c, d;
    scanf("%d %d %d %d",&a, &b, &c, &d);
    if(a>b){
        if(a>c){
            if(a>d){
                printf("a is greater");
            }
            else{
                printf("d is greater");
            }
        }
    }
    if(b>a){
        if(b>c){
            if(b>d){
                printf("a is greater");
            }
            else{
                printf("d is greater");
            }
        }
    }
    if(c>a){
        if(c>b){
            if(c>d){
                printf("c is greater");
            }
            else{
            printf("d is greater");                
            }
        }
    }
    if(d>a){
        if(d>b){
            if(d>c){
                printf("d is greater");
            }
            else{
                printf("c is greater"); 
            }
        }
    }
}