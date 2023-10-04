#include<stdio.h>
int main(){
    int a[3][3], i, j;
    printf("Enter the elements firstly by rows and then columns: ");
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            scanf("%d", &a[i][j]);
        }
    }
    printf("Matrix is: \n");
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            printf("%d ", a[i][j]);
        }
        printf("\n");
    }

    
}