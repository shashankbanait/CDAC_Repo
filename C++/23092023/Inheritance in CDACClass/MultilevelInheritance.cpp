#include <iostream>
using namespace std;
class Number{
    protected:
    int n;
    public:
    int func(){
        cin>>n;
        return n;
    }
};
class Square:protected Number{
    private: int a;
    public:
    int getSquare(){
        return a*a;
    }
};
class Square:protected Number{
    private: int a;
    public:
    int getSquare(){
        return a*a;
    }
};
class Cube:protected Number{
    private: int b;
    public:
    int getCube(){
        return b*b*b;
    }
};
int main(){
    
    return 0;
}