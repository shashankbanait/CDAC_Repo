// Create a class employee eid, ename, two functions taking input and output getsalary and showsalary

#include<iostream>
#include<string>
using namespace std;
class Employee{
    private:
        int eid;
        string ename;
    public:
        Employee(int x, string y){
            eid=x;
            ename=y;
        }
        void showSalary(){
            cout<<"Name: "<<ename<<endl;
            cout<<"Salary: "<<eid<<endl;
        }
};

int main(){
    int eid;
    string ename;
    cout<<"Enter eid"<<endl;
    cin>>eid;
    cout<<"Enter name"<<endl;
    cin>>ename;
    Employee obj(eid, ename);
    obj.showSalary();
}