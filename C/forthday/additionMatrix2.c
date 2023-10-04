#include<stdio.h>
int main(){
    int a[3][3], i, j, sum;
    printf("Enter the matrix: ");
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
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            if((i+j==0) || (i==1 && (j==0 || j==2)) || (i==2 && (j==0 || j==2))){
                sum += a[i][j];
            }
        }
    }
    printf("%d", sum);
}