#include <stdio.h>
int main(){
    int a= 2, b=1, c;
    c = a+b;
    goto sum;
    sub:
        printf("%d",a-b); 
    
    sum:
        printf("%d",a+b);
    
    return 0;
}
