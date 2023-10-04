/*
Define a class TEST in C++ with following description:
Private Members
TestCode of type integer
Description of type string
NoCandidate of type integer
CenterReqd (number of centers required) of type integer
A member function CALCNTR() to calculate and return the number of centers as
(NoCandidates/100+1)
Public Members
- A function SCHEDULE() to allow user to enter values for TestCode, Description,
NoCandidate & call function CALCNTR() to calculate the number of Centres
- A function DISPTEST() to allow user to view the content of all the data members
*/

#include<iostream>
using namespace std;
class Test{
    int TestCode;
    string description;
    int NoCandidate;
    int CenterRead;

    int calcntr(){
        CenterRead = (NoCandidate/100)+1;
        return 0;
    }

    public :
    void schedule(){
        cout<<"Enter test code :"<<endl;
        cin>>TestCode;
        cout<<"Enter description :"<<endl;
        cin>>description;
        cout<<"Enter number of candidates :"<<endl;
        cin>>NoCandidate;
        calcntr();
    }
    void display(){
        cout<<"Test Code :"<<TestCode<<endl;
        cout<<"Description :"<<description<<endl;
        cout<<"No Candidate :"<<NoCandidate<<endl;
        cout<<"Center Read :"<<CenterRead<<endl;
    }
};

int main() {
    Test obj;
    obj.schedule();
    obj.display();
    return 0;
}