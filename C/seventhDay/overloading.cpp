#include <iostream>
using namespace std;
int func1(int a, int b){
    return a+b;
}
float func1(int a, float b){
    return a+b;
}

int main(){
    cout<<func1(2,3);
    cout<<func1(4,6.5f);
    return 0;
}