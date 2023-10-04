// Unary operator
#include <iostream>
using namespace std;
class Overloading
{
    int a, b;

public:
    Overloading()
    {
        a = 5;
        b = 5;
    }

    void operator++()
    {
        a = ++a;
        b = b + 1;
    }
    void operator--()
    {
        a = a--;
        b = --b;
        a = --a;
        
    }
    void showValues()
    {
        cout << "value of a =" << a << endl << "value of b =" << b << endl;
    }
};

int main()
{

    Overloading i;
    cout<<"Before increment"<<endl;
    i.showValues();
    cout<<"After increment"<<endl;
    ++i;
    i.showValues();
    cout<<"After decrement"<<endl;
    --i;
    i.showValues();
}