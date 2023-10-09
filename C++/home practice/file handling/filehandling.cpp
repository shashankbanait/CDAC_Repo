#include<iostream>
#include<fstream>
/*
The useful classes for working with files in c++ are:
1. fstreambase
2. ifstream --> derived from fstreambase
3. ofstream --> derived from fstreambase
*/
// In order work with files in c++, you will have to open it. Primarily,
// there are 2 ways to open a file:
// 1. Using the constructor
// 2. Using the member function open() of the class

using namespace std;
int main(){
    string st = "CDAC Soft Polynomials";
    // opening files using constructor
    ofstream out("sample.txt");     // write operation
    out<<st
    .;

    // Opening files using constructor and reading it
    // ifstream in("sampleB.txt");    // Read operation
    // string st2;
    // // in>>st2;
    // getline(in, st2);
    // cout<<st2;
}