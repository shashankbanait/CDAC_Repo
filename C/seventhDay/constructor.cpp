#include<iostream>
using namespace std;
class demo{
    private: int a,b;
    public:
        demo(){     // default constructor
            a=10;
            b=20;
        }
        demo(int x, int y){     // parameterized constructor
            a=x;
            b=y;
        }
        demo(demo &d) {  // copy constructor
            a=d.a;      // d 10,20
            b=d.b;
        }
        void show() {
            cout<<"\n Value of a: "<< a;
            cout<<"\n Value of b: "<< b;
        }
        ~demo(){
            cout<<"\nDestructor is called......";
        }
};
int main(){
    demo d,d1(2,3),d3(d);
    d.show();
    d1.show();
    d3.show();
    return 0;
}