#include<iostream>
using namespace std;
template <class T1, class T2>
T1 smaller(T1 x, T2 y){
    return (x>y?x:y);
}
int main(){
    int a = 25;
    float b = 23.52;
    cout<<smaller(a,b)<<endl;
}