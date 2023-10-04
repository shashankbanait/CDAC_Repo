#include <iostream>
#include <fstream>
using namespace std;
int main()
{
    int a;
    float b;
    char c;
    char name[20];

    ofstream outf("App.txt");
    cout<<"Enter a int, float, char, string value"<<endl;
    cin>>a>>b>>c>>name;
    outf<<a<<endl<<b<<endl<<c<<endl<<name<<endl;
    outf.close();

    ifstream inf("App.txt", ios::in | ios::binary);
    inf>>a>>b>>c>>name;
    cout<<a<<endl;
    cout<<b<<endl;
    cout<<c<<endl;
    cout<<name<<endl;
    inf.close();
}
