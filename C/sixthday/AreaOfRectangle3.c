// With return without arguments
#include <stdio.h>

int calculateArea() {
    int length, width;
    printf("Enter length and width of the rectangle: ");
    scanf("%d %d", &length, &width);
    int answer = length * width;
    return answer;
}

int main() {
    int result = calculateArea();
    printf("Area of the rectangle: %d\n", result);
    return 0;
}
