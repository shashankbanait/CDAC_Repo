import java.util.Scanner;

public class Customer{
    private String name;
    private int account;
    
    public Customer(String name, int account) {
        this.name = name;
        this.account = account;
    }

    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw: ");
        int account = sc.nextInt();

        if(account.isSufficient)
    }

    public static void main(String[] args) {
        
    }
}