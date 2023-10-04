// Define a class BOOK with the following specifications :
// Private members of the class BOOK are
// BOOK NO integer type
// BOOKTITLE 20 characters
// PRICE float (price per copy)
// TOTAL_COST() A function to calculate the total cost for N number of copies
// where N is passed to the function as argument.
// Public members of the class BOOK are
// INPUT() function to read BOOK_NO. BOOKTITLE, PRICE
// PURCHASE() function to ask the user to input the number of copies to be
// purchased. It invokes TOTAL_COST() and prints the total cost to
// be paid by the user.
// Note : You are also required to give detailed function definitions. 

#include<iostream>
using namespace std;
class Book{
    private:
        int bookno;
        char title[20];
        float price;

        float total_cost(int n){
            int total =  price * n;
            return total;
        }
        
    public: 
        void input(){
            cout<<"Enter title of book: "<<endl;
            cin>>title;
            cout<<"Enter the price of the book: "<<endl;
            cin>>price;
        }
        void purchase(){
            cout<<"Enter no of books: "<<endl;
            cin>>bookno;
            
            cout<<"Total cost of all the books: "<<total_cost(bookno);
        }

};
int main(){
    Book obj;
    obj.input();
    obj.purchase();
    return 0;
}