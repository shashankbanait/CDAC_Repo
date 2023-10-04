import java.util.Scanner;

public class Questionjava {
    public static void main(String[] args) {
        
        int arr[] = new int[5];
        int sum = 0;
        System.out.println("Enter the percentage: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of 5 subjects: ");
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<5; i++){
            sum += arr[i];
        }

        int percentage = sum/5;

        if (percentage >= 90 && percentage <= 100) {
            System.out.println("A+");
        }
        else if (percentage >= 80) {
            System.out.println("A");
        }
        else if (percentage >= 70) {
            System.out.println("B+");
        }
        else if (percentage >= 60) {
            System.out.println("B");
        }
        else if (percentage >= 50) {
            System.out.println("C");
        }
        else if (percentage >= 40) {
            System.out.println("Fail");
        }
    }

}
