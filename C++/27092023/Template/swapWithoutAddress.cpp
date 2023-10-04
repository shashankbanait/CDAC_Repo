#include<iostream>
using namespace std;

template <class T>
void newswap(T a, T b) {
    T temp = a;
    a = b;
    b = temp;

    cout << "a after swap: " << a << endl;
    cout << "b after swap: " << b << endl;
}

int main() {
    int a = 5;
    int b = 6;

    newswap(a, b);

    return 0;
}
