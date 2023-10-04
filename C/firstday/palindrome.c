#include<stdio.h>

int main(){
    int original = 751, temp, rem;
    temp = original;
    int answer=0;   // to store the value we have got by dividing
    while(temp!=0){
        rem = temp%10;
        answer = (answer*10)+rem;
        temp = temp/10;
    }
    if(original == answer){
        printf("Yes");
        
    }
    else{
        printf("No");
    }
}