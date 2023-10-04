#include <iostream>
#include <string>
using namespace std;

class Person {
public:
    string name;
    int age;

    Person(string n, int a) : name(n), age(a) {}

    void display() {
        cout << "Name: " << name << endl;
        cout << "Age: " << age << " years" << endl;
    }
};

void printPersonInfo(Person p) {
    cout << "Inside the function:" << endl;
    p.display();
}

int main() {
    Person person1("Alice", 30);
    cout << "Outside the function:" << endl;
    person1.display();
    printPersonInfo(person1);

    return 0;
}