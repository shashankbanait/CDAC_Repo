#include <iostream>
using namespace std;

class Student {
protected:
    string name;
    int id;

public:
    void get() {
        cout << "Enter the name: ";
        cin >> name;
        cout << "Enter the id: ";
        cin >> id;
    }

    void put() {
        cout << "Name: " << name << endl;
        cout << "Id: " << id << endl;
    }
};

class Science : public Student {
protected:
    string s1, s2, s3;

public:
    void getin() {
        get();
        cout << "Enter s1: " << endl;
        cin >> s1;
        cout << "Enter s2: " << endl;
        cin >> s2;
        cout << "Enter s3: " << endl;
        cin >> s3;
    }

    void putin() {
        put();
        cout << "s1: " << s1 << endl << "s2: " << s2 << endl << "s3: " << s3 << endl;
    }
};

class Commerce : public Student {
protected:
    string c1, c2, c3;

public:
    void input() {
        get();
        cout << "Enter c1: ";
        cin >> c1;
        cout << "Enter c2: ";
        cin >> c2;
        cout << "Enter c3: ";
        cin >> c3;
    }

    void output() {
        put();
        cout << "c1: " << c1 << "c2: " << c2 << "c3: " << c3;
    }
};

int main() {
    Science s;
    s.getin();
    s.putin();
    Commerce c;
    c.input();
    c.output();
    return 0;
}