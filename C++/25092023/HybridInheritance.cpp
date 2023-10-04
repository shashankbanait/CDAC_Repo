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

class Test : public Student {
protected:
    int hindi, english, maths, chemistry, physics;
    int percentage;

public:
    void getin() {
        cout << "Enter your marks in Hindi: ";
        cin >> hindi;
        cout << "Enter your marks in English: ";
        cin >> english;
        cout << "Enter your marks in Maths: ";
        cin >> maths;
        cout << "Enter your marks in Chemistry: ";
        cin >> chemistry;
        cout << "Enter your marks in Physics: ";
        cin >> physics;
        percentage = (hindi + english + maths + chemistry + physics) / 5;
    }

    void putin() {
        cout << "Your percentage is: " << percentage << endl;
    }
};

class Sports {
protected:
    string favSport;

public:
    void getS() {
        cout << "Enter your favorite sport: ";
        cin >> favSport;
    }

    void putS() {
        cout << "Your favorite sport is: " << favSport << endl;
    }
};

class Result : public Test, public Sports {
public:
    void putS() {
        if (percentage > 85) {
            cout << "Your grade is: A" << endl;
        } else if (percentage > 75) {
            cout << "Your grade is: B" << endl;
        } else if (percentage > 65) {
            cout << "Your grade is: C" << endl;
        } else if (percentage > 55) {
            cout << "Your grade is: D" << endl;
        } else {
            cout << "You are failed" << endl;
        }
    }
};

int main() {
    Result r;
    r.get();      // Get student details
    r.getin();    // Get test marks
    r.getS();     // Get favorite sport
    r.put();      // Display student details
    r.putin();    // Display test results
    r.putS();     // Display grade and favorite sport
    return 0;
}