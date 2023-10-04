// Without return without arguments
#include <stdio.h>
void calculateArea() {
    int length, width;
    printf("Enter length and width of the rectangle: ");
    scanf("%d %d", &width, &length);
    
    int answer = length * width;
    
    printf("Area of the rectangle: %d\n", answer);
}

int main() {
    calculateArea();
    return 0;
}
