// #include <stdio.h>
// int main(){
//     int n = 5;
//     for(int i=0; i<n; i++){
        
//         if(i>=n/2){
//             for(int j=i; j>2*(n+i)+1; j--){
//             printf(" ");
//         }
//         }
//         else{
//             for(int j=0; j<2*(n-i)-1; j++){
//             printf(" ");
//         }
//         }
        
//         for(int j=0; j<2*i+1; j++){
//             printf("* ",j);
//         }

//         // for(int j=2*(n-i)-1; j<0; j++){
//         //     printf(" ");
//         // }
//         // for(int j=2*i+1; j<; j++){
//         //     printf("* ",j);
//         // }
//         printf("\n");
//     }
// }

#include <stdio.h>
int main(){
    int n = 5;
    // for(int i=0; i<n; i++){
    //     for(int j=0; j<2*(n-i)-1; j++){
    //         printf(" ");
    //     }
    //     for(int j=0; j<2*i+1; j++){
    //         printf("* ");
    //     }
    //     printf("\n");
    // }
        for(int i=0; i<n; i++){
        for(int j=2*(n-i)-1; j<0; j--){
            printf(" ");
        }
        for(int j=j<2*i+1; j<0; j--){
            printf("* ");
        }
        printf("\n");
        }
}