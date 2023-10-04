
// Q2. WAP in Java to check whether a number is divisible according to the following conditions
import java.util.Scanner;

public class QuestionDivisibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check divisibily: ");
        int no = sc.nextInt();
        if(no%8==0 && no%5==0){
                System.out.println("Divisible by 8 and 5");
        }
        else if(no%8==0){
            System.out.println("Divisible by 8");
        }
        else if(no%5==0){
            System.out.println("Divisible by 5");
        }
        else{
            System.out.println("Not divisible by 8 and 5");
        }
    }
}