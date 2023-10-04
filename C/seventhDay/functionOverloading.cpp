#include<iostream>
using namespace std;
int add(int a, int b){
        return a+b;
}
int add(int a, int b, int c){
    return a+b+c;
}
float add(int a, float b){
    return a+b;
}
int main(){
    cout<<add(2,3)<<endl;
    cout<<add(2,3,4)<<endl;
    cout<<add(2, 3.5f);
    return 0;
}