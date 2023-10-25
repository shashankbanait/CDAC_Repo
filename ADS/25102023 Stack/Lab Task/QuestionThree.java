// Q3.Write a Java program to insert an element into the array list at the first position.
// package Lab Task;
import java.util.ArrayList;
public class QuestionThree {
    public static void main(String[] args) {
        ArrayList<String> s2 = new ArrayList<>();
        s2.add("Yellow");
        s2.add("Green");
        s2.add("Grey");
        s2.add("Purple");
        s2.add("Red");

        System.out.println(s2);
        // After adding new element at first position
        s2.add(0, "Blue");
        System.out.println(s2);
    }
    
}
