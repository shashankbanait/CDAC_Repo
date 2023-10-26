// Q1. Write a Java program to take a string as an input and reverse it using Stack
// package Lab Task;

import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        String arr[] = new String[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++){
            arr[i] = sc.nextLine();
        }

        for(int i=4; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}