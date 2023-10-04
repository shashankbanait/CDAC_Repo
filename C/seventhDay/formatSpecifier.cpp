#include<iostream>
#include<string>

using namespace std;

void print(int num) {
    cout << "Integer: " << num << endl;
}

void print(float num) {
    cout << "Float: " << num << endl;
}

void print(char character) {
    cout << "Character: " << character << endl;
}

void print(string text) {
    cout << "String: " << text << endl;
}

int main() {
    int integerNumber = 42;
    float floatingNumber = 3.14159;
    char character = 'A';
    string text = "Shashank";

    print(integerNumber);
    print(floatingNumber);
    print(character);
    print(text);

    return 0;
}