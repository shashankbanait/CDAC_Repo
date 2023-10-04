#include<stdio.h>
int swap(int a, int b);
int main(){
    int x = 5; int y = 7;
    swap(x, y);
    return 0;
}
int swap(int a, int b){
    int temp = a;
    a = b;
    b = temp;

    printf("%d %d", a, b);
}