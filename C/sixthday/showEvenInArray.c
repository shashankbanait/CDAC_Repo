// WAP to show an element of the array
#include<stdio.h>
int main(){
    int arr[] = {12, 3,4, 635, 434};
    for(int i=0; i<5; i++){
        if((arr[i]%2)==0){
            printf("%d ", arr[i]);
        }
    }
    return 0;
}