#include<iostream>
using namespace std;
template <class T>
T add(T a, T b){
    return a+b;
}
int main(){
    int x= 34, y=45, z;
    z = add(x, y);
    cout<<"Addition is: "<<z<<endl;
}