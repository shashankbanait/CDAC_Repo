#include<stdio.h>
int main(){
    int a, ans;
    printf("Enter the amount: ");
    scanf("%d", &a);
    if(a>1000){
        ans = a*(.15);
        printf("Commission is: %d", ans);
    }
    else{
        printf("No commissionn");
    }
}