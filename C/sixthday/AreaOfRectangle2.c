// Without return with arguments
#include <stdio.h>
void calculateArea(int length, int width) {
    int answer = length * width;
    printf("Area of the rectangle: %d\n", answer);
}

int main() {
    int length, width;
    printf("Enter length and width of the rectangle: ");
    scanf("%d %d", &length, &width);
    calculateArea(length, width);
    return 0;
}
