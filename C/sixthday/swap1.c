// Without return without arguments
#include <stdio.h>

void swap() {
    int temp, a, b;
    
    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);
    
    temp = a;
    a = b;
    b = temp;
    
    printf("Swapped values: a = %d, b = %d\n", a, b);
}

int main() {
    swap();
    return 0;
}
