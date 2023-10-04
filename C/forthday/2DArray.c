#include<stdio.h>
int main(){
    int a[2][2], i, j;
    printf("Enter element matrix ");
    for(int i=0; i<2; i++){
        for(int j=0; j<2; j++){
            scanf("%d", &a[i][j]);
        }
    }
    printf("Your matrix is: \n");
    for(int i=0; i<2; i++){
        for(int j=0; j<2; j++){
            printf("%d ", a[i][j]);
        }
        printf("\n");
    }
}