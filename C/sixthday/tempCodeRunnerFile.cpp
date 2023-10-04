#include <iostream>
using namespace std;
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
    int num2, i, c = 0;
    cout << "\nenter the number";
    cin >> num2;
    for (i = 2; i <= num2; i++)
    {
      if (num2 % i == 0)
      {
        c++;
      }
    }
    if (c == 1)
    {
      cout << "prime number";
    }
    else
    {
      cout << "not prime number";
    }
    break;
  case 3:
    int num3, r, temp = 0, s1;
    cout << "enter the number";
    cin >> num3;
    temp = num3;
    while (num3 > 0)
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
    int num4, r2, rev = 0, temp2 = 0;
    cout << "\nenter any number";
    cin >> num4;
    temp = num4;
    while (num4 != 0)
    {
      r = num4 % 10;
      rev = rev * 10 + r2;
      num4 = num4 / 10;
    }
    if (temp == rev)
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