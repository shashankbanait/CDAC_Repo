//     *
//    **
//   ***
//  ****
// *****
#include<iostream>
using namespace std;
int main(){
    int n=5;
    scanf("%d",&n);
    for(int i=0; i<n; i++){
        for(int j=0; j<n-1; i++){
        cout<<" ";
        }
        for(int j=0; j<i; j++){
            cout<<"*";
        }
    }
    
    return 0;
}