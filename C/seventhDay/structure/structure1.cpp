#include<iostream>
using namespace std;
struct student{
    int prn_no;
    char name[100];
};
int main(){
    struct student s;
    cout<<"Enter prn_no: \n";
    cin>>s.prn_no;
    cout<<"\nEnter name: ";
    cin>>s.name;
    cout<<"\nYour prn_no is: "<<s.prn_no;
    cout<<"\nYour name is: "<<s.name;

    return 0;
}