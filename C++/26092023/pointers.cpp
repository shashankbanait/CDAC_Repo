#include<iostream>
using namespace std;

int main(){
    int x = 10;
    int *p;
    p = &x;

    cout<<"\nAddress of x: "<<&x<<"\nAgain address of x: "<<p;
    cout<<"\nValue of x: "<<x<<"\nAgain value of x: "<<*p;
    return 0;
}