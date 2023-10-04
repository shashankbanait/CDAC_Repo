#include <iostream>
using namespace std;

int main()
{
    try
    {
        int age;
        cout << "\nEnter the age of the candidate: ";
        cin >> age;
        if (age > 21)
        {
            cout << "\nYou are eligible for marriage.";
        }
        else
        {
            throw "\nNOOOOO just wait for some years.";
        }
    }
    catch (const char *msg)
    {
        cout << msg <<endl;
    }
    return 0;
}