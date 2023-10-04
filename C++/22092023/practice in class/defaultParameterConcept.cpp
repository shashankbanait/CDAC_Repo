#include<iostream>
using namespace std;
class demo{
    int a, b, c;
    public: 
    void fun(int a, int b=20, int c=10){
        int d = a+b+c;
        cout<<"Addition= "<<d;
    }
};
// void demo::fun(int a, int b, int c){
//     int d = a+b+c;
//     cout<<"Addition= "<<d;
// }
int main(){
    demo d1;
    int a,b,c;
    cout<<"Enter the value of a \n";
    cin>>a>>b>>c;
    d1.fun(a,b,c);
    return 0;
}