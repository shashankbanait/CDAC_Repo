#include <stdio.h>

int main() {
    int marks[5];
    int total = 0;

    printf("Enter marks for five subjects:\n");

    for (int i = 0; i < 5; i++) {
        scanf("%d", &marks[i]);
        total += marks[i];
    }

    float average = (float)total / 5;

    printf("Total marks: %d\n", total);
    printf("Average marks: %.2f\n", average);

    return 0;
}