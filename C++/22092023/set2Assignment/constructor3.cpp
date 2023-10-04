#include <iostream>
using namespace std;
class Sample
{
private:
    int x;
    double y;

public:
    Sample();            // Constructor 1
    Sample(int);         // Constructor 2
    Sample(int, int);    // Constructor 3
    Sample(int, double); // Constructor 4
};

Sample::Sample()
{
    x = 0;
    y = 0;
    cout<<x<<endl;
    cout<<y<<endl;
}

Sample::Sample(int a){
    x=a;
    y=0;
    cout<<x<<endl;
    cout<<y<<endl;
}

Sample::Sample(int a, int b){
    x=a;
    y=b;
    cout<<x<<endl;
    cout<<y<<endl;
}

Sample::Sample(int a, double b){
    x=a;
    y=b;
    cout<<x<<endl;
    cout<<y<<endl;
}

int main()
{
    Sample s, s2(5), s3(4,6), s4(3,7.8);
}