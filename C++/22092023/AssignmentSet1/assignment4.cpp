// Define a class in C++ with following description:
// Private Members
// A data member Flight number of type integer
// A data member Destination of type string
// A data member Distance of type float
// A data member Fuel of type float
// A member function CALFUEL() to calculate the value of Fuel as per the following
// criteria
//  Distance Fuel
//  <=1000 500
//  more than 1000 and <=2000 1100
//  more than 2000 2200
// Public Members
// A function FEEDINFO() to allow user to enter values for Flight Number,
// Destination, Distance & call function CALFUEL() to calculate the quantity of Fuel
// A function SHOWINFO() to allow user to view the content of all the data members
#include<iostream>
using namespace std;
class MyClass{
    private:
        int flightNO;
        string destination;
        float distance;
        float fuel;
        int calfuel(){
            if(distance<=1000){
                fuel=500;
            }
            else if(distance>100 && distance<=2000){
                fuel=1100;
            }
            else{
                fuel=2200;
            }
            return fuel;
        }
        
    public: 
        void feedInfo(){
            cout<<"Enter flight no: "<<endl;
            cin>>flightNO;
            cout<<"Enter destination: "<<endl;
            cin>>destination;
            cout<<"Enter distance: "<<endl;
            cin>>distance;
            cout<<"Your fuel will be: "<<calfuel();
        }

};
int main(){
    MyClass obj;
    obj.feedInfo();
    return 0;
}