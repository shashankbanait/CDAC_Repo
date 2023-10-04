#include <stdio.h>
int main(){
    int n = 5;
    for(int i=0; i<n; i++){
        for(int j=0; j<2*(n-i)-1; j++){
            printf(" ");
        }
        for(int j=65; j<2*i+66; j++){
            printf("%c ",j);
        }
        printf("\n");
    }
}