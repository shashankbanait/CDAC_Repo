#include <stdio.h>

int main() {
    char str[] = "Shashank";
    int i = 0;
    while (str[i] != '\0') {
        i++;
    }    
    if (i > 0) {
        printf("First character: %c\n", str[0]);
        printf("Last character: %c\n", str[i - 1]);
    }
    return 0;
}