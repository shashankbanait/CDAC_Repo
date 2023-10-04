// Define a class batsman with the following specifications:
// Private members:
// bcode 4 digits code number
// bname 20 characters
// innings, notout, runs integer type
// batavg it is calculated according to the formula –
//  batavg =runs/(innings-notout)
// calcavg() Function to compute batavg
// Public members:
// readdata() Function to accept value from bcode, name, innings, notout
// and invoke the function calcavg()
// displaydata() Function to display the data members on the screen.
#include<iostream>
using namespace std;
class Batsman{
    private:
        int bcode;
        char bname[20];
        int innings, notout, runs;
        float batavg;
        float calcavg(){
            batavg = runs/(innings-notout);
            return batavg;
        }
    public:
    void readData(){

        while(true){
            cout<<"Enter bcode: ";
            cin>>bcode;
            if(bcode>999 && bcode<10000){
                break;
            }
        }
        cout<<"Enter name: ";
        cin>>bname;
        cout<<"Enter innnings: ";
        cin>>innings;
        cout<<"Enter notout: ";
        cin>>notout;
        cout<<"Enter runs: ";
        cin>>runs;
    }
    void displayData(){
        cout<<"bcode: "<<bcode<<endl;
        cout<<"name: "<<bname<<endl;
        cout<<"innings: "<<innings<<endl;
        cout<<"notout: "<<notout<<endl;
        cout<<"runs: "<<runs<<endl;   
        cout<<"Your average is: "<<calcavg()<<endl;
    }
    
};
int main(){
    Batsman b;
    b.readData();
    b.displayData();
    return 0;
}