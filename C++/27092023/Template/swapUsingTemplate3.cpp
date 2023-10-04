// WAP to swap to variables using template
#include<iostream>
using namespace std;
template <class T>
void nswap(T &a, T &b){
    T temp = a;
    a = b;
    b = temp;
}

int main(){
    int i = 5;
    int j = 6;
    nswap(i, j);
    cout << "a after swap: " << i << endl;
    cout << "b after swap: " << j << endl;
    return 0;
}