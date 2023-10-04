#include <stdio.h>
int swap(int a, int b);
int main(){
    int a = 5;
    int b = 6;
    int ptr1 = &a;
    int ptr2 = &b;
    
    swap(int ptr1, int ptr2);
    return 0;
}
int swap(int &a, int &b){
    int temp = &a;
    &a = &b;
    &b = temp;
}