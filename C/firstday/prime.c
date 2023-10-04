#include <stdio.h>
int main(){
    int n=7;
    int c = 0;
    for(int i=2; i+i<=n; i++){
        for(int j=2; j<=i; j++){
            if(n%j==0){
                c++;
            }
        }
    }
    if(c==2){
        printf("prime");
    }
}