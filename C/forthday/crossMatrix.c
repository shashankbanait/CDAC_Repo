#include<stdio.h>
int main(){
    int a[3][3], i, j, sum;
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
    
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            if(((i+j)==0) || ((i+j)==2) || ((i+j)==4)){
                sum = sum + a[i][j];
            }
        }
    }
    printf("Sum is: %d", sum);
}