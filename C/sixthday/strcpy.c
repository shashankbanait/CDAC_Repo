#include <stdio.h>
#include <string.h>

int main() {
    char cdac1[50];
    char cdac2[50];

    printf("Enter a string: ");
    scanf("%s", cdac1);

    strcpy(cdac2, cdac1);

    printf("Copied string: %s\n", cdac2);

    return 0;
}
