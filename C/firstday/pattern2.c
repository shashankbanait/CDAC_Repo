// 5 5 5 5 5
// 4 4 4 4
// 3 3 3
// 2 2
// 1

// C program to print inverted half pyramid pattern of number
#include <stdio.h>
    
int main()
{
    int n;
      printf("Number of rows: ");
      scanf("%d", &n);
    for (int i = n; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            printf("%d ", i);
        }
        printf("\n");
    }
    return 0;
}