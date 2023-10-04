// WAP to find the biggest element in the array
#include<stdio.h>
int main(){
    int arr[] = {12, 3,4, 635, 434};
    int largest = arr[0];
    for(int i=0; i<5-1; i++){
        if(arr[i]<arr[i+1]){
            largest = arr[i+1];
        }
    }
    printf("%d", largest);
    return 0;
}