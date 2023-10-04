#include <iostream>
using namespace std;
double pers(int a)
{
    if (a > 50)
    {
        cout<< "You are eligible move forward";
    }
    else
    {
        throw "\n sorry you are not eligible ";
    }
}
int main()
{
    try
    {
        int choice;
        float percentage;
        cout << "Are you from Engineering background: " << endl;
        cout << "Choose 1 for 'YES' and 2 for 'NO'; " << endl;
        cin >> choice;
        if (choice == 1)
        {
            cout << "Great you are eligible in this criteria move forward";
        }
        else
        {
            cout << "Sorry!\n You are not eligible";
        }

        cout << "Enter your overall percentage of BTech: ";
        cin >> percentage;
        pers(percentage);
    }

    catch (const char *msg)
    {
        cerr << msg << endl;
    }
    return 0;
}