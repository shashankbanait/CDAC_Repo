// Define a class student with the following specification
// Private members of class student
// admno integer
// sname 20 character
// eng. math, science float
// total float
// ctotal() a function to calculate eng + math + science with float return
// type.
// Public member function of class student
// Takedata() Function to accept values for admno, sname, eng, science and
// invoke ctotal() to calculate total.
// Showdata() Function to display all the data members on the screen.
#include<iostream>
#include<string>
using namespace std;
class Student{
    private:
        int admno;
        char sname[20];
        float english, maths, science;
        float total;
        float sum;
        float ctotal(){
            sum=english+maths+science;
            return sum;
        }
    public:
        void takeDate(){
            cout<<"Enter admno: ";
            cin>>admno;
            cout<<"Enter sname : ";
            cin>>sname;
            cout<<"Enter english marks : ";
            cin>>english;
            cout<<"Enter maths marks : ";
            cin>>maths;
            cout<<"Enter science marks : ";
            cin>>science;
        }
        
        void showData(){
            cout<<"***************************************************"<<endl;
            cout<<"*                        admno:"<<admno<<"                   *"<<endl;
            cout<<"*                        sname:"<<sname<<"                 *"<<endl;
            cout<<"*                        Total is:"<<ctotal()<<"               *"<<endl;
            cout<<"***************************************************"<<endl;
        }
};
int main(){
    Student s;
    s.takeDate();
    s.showData();
    return 0;
}