#include <stdio.h>

int main() {
    char str[] = "Shashank Banait";
    int i = 0;

    while (str[i] != '\0') {
        if (str[i] == 'a' || str[i] == 'A' || str[i] == 'e' || str[i] == 'E' ||
            str[i] == 'i' || str[i] == 'I' || str[i] == 'o' || str[i] == 'O' ||
            str[i] == 'u' || str[i] == 'U') {
            printf("%c", str[i]);
        }
        i++;
    }

    return 0;
}
