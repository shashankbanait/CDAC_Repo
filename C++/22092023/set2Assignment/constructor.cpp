#include<iostream>
using namespace std;
class Demo{
    private:
        int a;
        int b;
    public:
        Demo(){
            a=5;
            b=6;
        }
        Demo(int x, int y){
            a=x;
            b=y;
        }
        Demo(Demo &x){
            a=x.a;
            b=x.b;
        }
        void show(){
            cout<<a<<" "<<b<<endl;
        }
};
int main(){
    Demo d, d1(8, 24), d2(d1);
    d.show();
    d1.show();
    d2.show();
}