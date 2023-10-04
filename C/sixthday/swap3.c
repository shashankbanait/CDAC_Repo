// With return without arguments
#include <stdio.h>
int* swap() {
    static int temp, a, b;
    
    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);
    
    temp = a;
    a = b;
    b = temp;
    
    return &a;
}

int main() {
    int* result = swap();
    
    printf("Swapped values: a = %d, b = %d\n", *result, *(result + 1));
    return 0;
}
