// With return with arguments
#include <stdio.h>
int calculateArea(int length, int width) {
    int answer = length * width;
    return answer;
}

int main() {
    int length, width;
    printf("Enter length and width of the rectangle: ");
    scanf("%d %d", &length, &width);
    int result = calculateArea(length, width);
    printf("Area of the rectangle: %d\n", result);
    return 0;
}
