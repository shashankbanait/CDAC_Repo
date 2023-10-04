// wap function name is to be print different data types by using thhe function name as print
// area of rectangle and area of circle

#include <iostream>
using namespace std;
int areaOfRectangle(int a, int b){
    return a * b;
}

int areaOfCircle(int r){
    return (3.14 * r * r);
}

int main(){
    int l, b, x;
    cout << "Enter the length: ";
    cin >> l;
    cout << "Enter the breadth: ";
    cin >> b;
    cout << "Area of rectangle is: " << areaOfRectangle(l, b) << endl;

    cout << "Enter the radius: ";
    cin >> x;
    cout << "Area of circle is: " << areaOfCircle(x) << endl;

    return 0;
}