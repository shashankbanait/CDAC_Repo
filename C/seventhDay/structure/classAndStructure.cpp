// Class is a collection of data members and member functions.
#include<iostream>
using namespace std;
class student{
    private:
        int prn_no;
        char name[20];
        public:
        void get(){
            cout<<"\nEnter PRN no and Name: ";
            cin>>prn_no>>name;
        }
        void put(){
            cout<<"\n Prn NO IS: "<<prn_no;
            cout<<"\n Student Name: "<<name;
        }
};
int main(){
    // student s, p;   // Instantiate
    student s[2];   // Array of an object
    
    for(int i=0; i<2; i++){
        s[i].get();
        s[i].put();
    }

    // student s,*p;
    // p=&s;
    // p->get();
    // p->put();
    
}