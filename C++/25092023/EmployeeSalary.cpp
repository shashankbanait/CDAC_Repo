#include <iostream>
#include <string>

using namespace std;

class Employee {
private:
    string name;
    int id;

public:
    void setData(const string& employeeName, int employeeId) {
        name = employeeName;
        id = employeeId;
    }

    string getName() const {
        return name;
    }

    int getId() const {
        return id;
    }
};

class Salary {
private:
    double salary;

public:
    void setSalary(double employeeSalary) {
        salary = employeeSalary;
    }

    void printSalary() const {
        cout << "Salary: $" << salary << endl;
    }
};

int main() {
    Employee employee;
    Salary empSalary;

    string name;
    int id;
    double salary;

    cout << "Enter Employee Name: ";
    cin >> name;

    cout << "Enter Employee ID: ";
    cin >> id;

    cout << "Enter Salary: ";
    cin >> salary;

    employee.setData(name, id);
    empSalary.setSalary(salary);

    cout << "Employee Name: " << employee.getName() << endl;
    cout << "Employee ID: " << employee.getId() << endl;
    empSalary.printSalary();

    return 0;
}
