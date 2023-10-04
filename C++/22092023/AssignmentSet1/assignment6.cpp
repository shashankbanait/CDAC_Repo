// Define a class REPORT with the following specification:
// Private members :
// adno 4 digit admission number
// name 20 characters
// marks an array of 5 floating point values
// average average marks obtained
// GETAVG() a function to compute the average obtained in five subject
// Public members:
// READINFO() function to accept values for adno, name, marks. Invoke the
// function GETAVG()
// DISPLAYINFO() function to display all data members of report on the screen.
// You should give function definitions.

#include<iostream>
using namespace std;
class Report{
    private:
        int adno;
        char name[20];
        float marks[5];
        int total;
        int average;
        void getavg(){
            for(int i=0; i<5; i++){
                total += marks[i];
            }
            average = total/5;
            cout<<"Average of marks: "<<average<<endl;
        }
        
    public:
        void readinfo(){
            
            while(true){
            cout<<"Enter adno: ";
            cin>>adno;
            if(adno>999 && adno<10000){
                break;
            }
            }
            cout<<"Enter the name: "<<endl;
            cin>>name;
            cout<<"Enter five elements of an array: "<<endl;
            for(int i=0; i<5; i++){
                cin>>marks[i];
            }
            getavg();
        }
        void displayinfo(){
            cout<<"The value of adno: "<<adno<<endl;
            cout<<"The value of name: "<<name<<endl;
            for(int i=0; i<5; i++){
                cout<<"The value of "<<i+1<<"th subject is "<<marks[i]<<endl;
            }
        }

};
int main(){
    Report obj;
    obj.readinfo();
    obj.displayinfo();
    return 0;
}