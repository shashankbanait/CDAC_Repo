// WAP to add the elements of the array
#include<stdio.h>
int main(){
    int sum;
    int arr[] = {12, 3,4, 635, 434};
    for(int i=0; i<5; i++){
        sum += arr[i];
    }
    printf("%d", sum);
    return 0;
}