#include<iostream>
using namespace std;

int main(){
    char a = 'b';
    char *ptr;
    cout<<"original value: "<<a;
    ptr = &a;
    cout<<endl<<"Address of a : "<<(int)ptr<<endl;
    cout<<"Oriinal vlaue"<<a<<endl<<"pointer vlaue";

    return 0;
}