#include<iostream>
using namespace std;
class MyClass{
public:
    int func1(int a, int b){
        return a+b;
    }
    int func1(int c, float d){
        return c+d;
    }
};
int main(){
    MyClass m;
    int result = m.func1(4, 5.8f);
    int newResult = m.func1(8, 14);
    cout << result << endl;
    cout << newResult << endl;
    return 0;
}
