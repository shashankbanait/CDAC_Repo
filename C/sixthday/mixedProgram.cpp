#include <iostream>
using namespace std;
int c1 = 0; // Prime number wala c1 variable globally declare kiya
int s1 = 0; // It was not initialized by zero previously
int rev = 0;      // yaha cross initialization ki error thi to doosri line me initialize kiya
int temp2 = 0;
int main()
{
  int n;
  cout << "enter 1 for even odd\nenter 2 for prime numer\n enter3 for armstrong\nenter4 for palindrome" << endl;
  cin >> n;
  switch (n)
  {
  case 1:
    int num1;
    cout << "\nenter the number";
    cin >> num1;
    if (num1 % 2 == 0)
    {
      cout << "\neven number";
    }
    else
    {
      cout << "\nodd number";
    }
    break;

  case 2:
    int num2, i;

    cout << "Enter the number: ";
    cin >> num2;

    for (i = 2; i <= num2; i++) {
        if (num2 % i == 0) {
            c1++;
        }
    }

    if (c1 == 1) {
        cout << "Prime number" << endl;
    } else {
        cout << "Not prime number" << endl;
    }
    break;

  case 3:
    int num3, r;
    int temp;
    cout << "enter the number";
    cin >> num3;
    temp = num3;
    while (num3 != 0)
    {
      r = num3 % 10;
      s1 = s1 + (r * r * r);
      num3 = num3 / 10;
    }
    if (temp == s1)
    {
      cout << "\n armstrong number";
    }
    else
    {
      cout << "\n not armstrong number";
    }
    break;

  case 4:
    int num4, r2;
    cout << "\nenter any number";
    cin >> num4;
    temp2 = num4;
    while (num4 != 0)
    {
      r2 = num4 % 10;     // there was r previously so i changed it to r2
      rev = (rev * 10) + r2;
      num4 = num4 / 10;
    }
    if (temp2 == rev)     // temp the to temp2 kiya
    {
      cout << "\npalimdrom";
    }
    else
    {
      cout << "\nnot palimdrom";
    }
    break;
  }
}

