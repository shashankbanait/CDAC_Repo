// create class A, Class B. 
// one variable private, 
// each class has to take 2 parameters and voig get a void get b

#include<iostream>
using namespace std;
class A{
    private:    
        int a;
    public:
        int get(){
            cout<<"Enter value of A: ";
            cin>>a;
            return a;
        }
};
class B{
    private:
        int b;
    public: 
        int getin(){
            cout<<"Enter value of B: ";
            cin>>b;
            return b;
        }
};
class C:public A, public B{
    private:
        int c;
    public:
        void add(){
            cout<<(get()  +getin());
        }
};
int main(){
    C c;
    c.add();
}