// Design a class Holiday with two data members initialize it with 0, 1 and 2 arguments
#include<iostream>
#include<string>
using namespace std;
class Holiday{
    private:
        string name;
        string address;
        string destination;
        string email;
        int passportNo;
        int contact;

    public:
        Holiday(){
            cout<<"Hey, Just relax on home";
        }
        Holiday(string a, string b, string c, string d, int e, int f){
            name=a;
            address=b;
            destination=c;
            email=d;
            passportNo=e;
            contact=f;
        }
        void showDetails(){
            cout<<"\n_____________________________________\n";
            cout<<"-------------------------------------\n";
            cout<<"Your name is: "<<name<<"\n Your address is: "<<address;
            cout<<"\nYour name is: "<<destination<<"\n Your address is: "<<email;
            cout<<"\nYour name is: "<<passportNo<<"\n Your address is: "<<contact;
            
        }
};
int main(){
    string j,k,l,m;
    long n,o;
    cout<<"__________________________________________\n";
    cout<<"------------------------------------------\n";
    cout<<"Enter your name: ";
    cin>>j;
    cout<<"\nEnter your address: ";
    cin>>k;
    cout<<"\nEnter your destination: ";
    cin>>l;
    cout<<"\nEnter your email: ";
    cin>>m;
    cout<<"\nEnter your passport number: ";
    cin>>n;
    cout<<"\nEnter your contact: ";
    cin>>o;

    Holiday h2(j,k,l,m,n,o);
    // Holiday h1;
    h2.showDetails();
    return 0;
}