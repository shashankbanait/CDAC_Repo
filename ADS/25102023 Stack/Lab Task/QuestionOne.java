// Q1. Write a Java program to create a new array list, add some colors (string) and print out the collection
// package Lab Task;
import java.util.ArrayList;
public class QuestionOne {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("Yellow");
        s.add("Green");
        s.add("Grey");
        s.add("Purple");
        s.add("Red");

        System.out.println(s);
    }
}
