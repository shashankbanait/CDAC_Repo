/*
2. Write a program in java to create a class name studinfo accept the student
information by the member method getdata and inherit it in the base class name marks create
method to get marks in derived class and calculate the percentage and display the complete
information of student do this for three students.
*/

import java.util.Scanner;

class StudInfo {
    String name;
    int rollNo;
    String branch;

    void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        name = scanner.nextLine();
        System.out.println("Enter Roll Number: ");
        rollNo = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter Branch: ");
        branch = scanner.nextLine();
    }
}

class Marks extends StudInfo {
    int marks1;
    int marks2;
    int marks3;

    void getMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Marks for Subject 1: ");
        marks1 = scanner.nextInt();
        System.out.println("Enter Marks for Subject 2: ");
        marks2 = scanner.nextInt();
        System.out.println("Enter Marks for Subject 3: ");
        marks3 = scanner.nextInt();
    }

    double calculatePercentage() {
        double totalMarks = marks1 + marks2 + marks3;
        return (totalMarks / 300) * 100;
    }

    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Branch: " + branch);
        System.out.println("Marks in Subject 1: " + marks1);
        System.out.println("Marks in Subject 2: " + marks2);
        System.out.println("Marks in Subject 3: " + marks3);
        System.out.println("Percentage: " + calculatePercentage() + "%");
    }
}

public class Second {
    public static void main(String[] args) {
        Marks[] students = new Marks[3];

        for (int i = 0; i < 3; i++) {
            students[i] = new Marks();
            System.out.println("Enter details for Student " + (i + 1));
            students[i].getData();
            students[i].getMarks();
        }

        System.out.println("Student Information for Three Students:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Student " + (i + 1) + " Details:");
            students[i].displayInfo();
            System.out.println();
        }
    }
}