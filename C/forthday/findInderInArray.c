// Question: Find the index of the element entered by the user 
#include<stdio.h>
int main(){
    int num, temp=-1;      // temp variable is for storing the index of the element
    int a[7] = {11, 32, 64, 78, 76, 13, 44};
    printf("Enter a number to find the position: ");
    scanf("%d", &num);
    for(int i=0; i<7; i++){
        if(a[i]==num){
            temp = i;
            break;
        }
    }
    if(temp>-1){        // comparing the index cause: index can not be -1
        printf("Index of the element is: %d", temp);
    }
    else{
        printf("Not present in the array");
    }
    return 0;
}
