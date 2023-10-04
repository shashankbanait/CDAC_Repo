#include<stdio.h>
int main(){
    char name[100];
    int flavour;
    char flavourname[100];
    int quantity, selected;
    printf("Enter your name: ");
    scanf("%s", &name);

    printf("Choose your favorite flavour's number: 1. vanilla\n 2. mango\n 3. blackberry\n 4. sitafal\n");
    scanf("%s", &flavour);

    printf("Enter your quantity: \n");
    scanf("%d", &quantity);

    switch (flavour)
    {
    case '1':
        selected = 100;
        break;
    case '2':
        selected = 200;
        break;
    case '3': 
        selected = 300;
        break;

    case '4': 
        selected = 400;
        break;

    default:
        printf("You haven't selected any choice");
        break;
    }

    int gst;
    int finalamount = selected*quantity;
    
    gst = finalamount * (.18);
    int newfinal = gst + finalamount;

    printf("\n________________________________________________");
    printf("\n________________________________________________");

    printf("\nHey here is your bill: ");
    printf("\nThank you %s for shopping with us", name);
    // printf("\nYour flavour is: %s", flavour);        // not printing and terminating the program
    
    printf("\nYour amount is: %d", finalamount);
    printf("\nGST is: %d", gst);
    printf("\nYour final amount is: %d", newfinal);

    printf("\n________________________________________________\n");
    printf("________________________________________________");
}