#include<iostream>
using namespace std;
class Overloading{
    int a, b;
    public: 
        void get(int a){
            cout<<"This is a: "<<a;
        }
        void get(int a, int b){
            cout<<"This is a: "<<a<<endl<<"This is b: "<<b<<endl;
        }
};
int main(){
    Overloading o;
    o.get(5);
    cout<<endl;
    o.get(4, 5);
}