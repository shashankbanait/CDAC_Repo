#include<iostream>
using namespace std;
class Base{
    private:
        int a, b;
    public:
        void get(){
            cout<<"\nEnter 2 number: ";
            cin>>a>>b;
        }
        void show(){
            cout<<"A"<<a;
            
        }
};
class Derive : private Base{
    public: 
        void display(){
            get();
            show();
            cout<<"We are calling base class";
        }
};
int main(){
    Derive d;
    d.display();
    return 0;
}