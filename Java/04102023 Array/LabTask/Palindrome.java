import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the number to check whether it is palindrome or not: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem, ans = 0;
        int temp = num;
        while(temp!=0){
            rem = temp%10;
            ans = (ans * 10) + rem;
            temp = temp / 10;
        }
        if(ans==num){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is not palindrome");
        }
    }
    
}
