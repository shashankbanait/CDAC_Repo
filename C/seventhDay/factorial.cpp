// Factorial with return with arguments
#include <iostream>
using namespace std;

int fact(int num) {
    int ans = 1;
    for (int i = 1; i <= num; i++) {
        ans = ans * i;
    }
    return ans;
}

int main() {
    int n;
    cin >> n;
    cout << fact(n);
    return 0;
}