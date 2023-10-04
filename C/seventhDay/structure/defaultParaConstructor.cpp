#include<iostream>
#include<string>
using namespace std;
class Student{
    private: 
    string name;
    int rollNo;
    long long contact;
    string address;
    public:
        Student(){     // default constructor
            name="Shashank";
            rollNo=20;
            contact=1234567890;
            address="Gali Mohalla";
        }
        Student(string s, int y, long long c, string address){     // parameterized constructor
            name=s;
            rollNo=y;
            contact=c;
            address=address;
        }
        
        void showStudent() {
            cout<<"\n Name: "<< name;
            cout<<"\n roll no: "<< rollNo;
            cout<<"\n contact: "<< contact;
            cout<<"\n address: "<< address;
        }
        // ~Student(){
        //     cout<<"\nDestructor is called......";
        // }
};
int main(){
    cout<<"________________________________\n";
    Student s1,s2("Shashank", 2345, 1234567890, "Gali_Mohalla");
    s1.showStudent();
    s2.showStudent();
    cout<<"\n________________________________";
    return 0;
}