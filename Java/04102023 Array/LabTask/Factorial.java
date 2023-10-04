import java.util.Scanner;

public class Factorial {
    int ans = 0;
    public int fact(int n){
        if(n==0)
            return 1;
        else
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number to check the factorial of a number: ");
        Factorial obj = new Factorial();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(obj.fact(num));;
    }
    
}
