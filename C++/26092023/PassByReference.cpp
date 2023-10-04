#include<iostream>
using namespace std;
void doit(int *num){
    *num = *num*6;
}
int main(){
    int number = 10;
    doit(&number);
    cout<<"Value  of number: "<<number;
}