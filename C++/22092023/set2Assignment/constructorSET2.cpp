#include<iostream>
using namespace std;
class cashRegister{
    private:
        int cashOnHand;
    public:
        cashRegister(){
            cashOnHand = 500;
        }
        cashRegister(int a){
            cashOnHand = a;

        }
        int getCurrentBalance(){
            return cashOnHand;
        }
        int acceptAmount(int b){
            cashOnHand += b;
        }
};
class dispenserType{
    private:
        int numberOfItems;
        int cost;
    public:    
        dispenserType(){
            numberOfItems=50;
            cost=50;
        }
        dispenserType(int a, int b){
            cost = a;
            numberOfItems = b;
        }
        int getNoOfItems(){
            return numberOfItems;
        }
        int getCost(){
            return cost;
        }
        int makeSale(){
            numberOfItems--;
        }

    void showSelection(){
        
    }
    void sellProduct(){
            
    }
};
int main(){

    return 0;
}