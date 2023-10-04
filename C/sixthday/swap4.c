// With return with arguments
#include <stdio.h>
void swap(int *a, int *b) {
    int temp;
    temp = *a;
    *a = *b;
    *b = temp;
}

int main() {
    int a, b;
    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);
    
    swap(&a, &b);
    
    printf("Swapped values: a = %d, b = %d\n", a, b);
    return 0;
}
