// Q4.Write a Java program to retrieve an element (at a specified index) from a given array list.
// package Lab Task;
import java.util.ArrayList;
public class QuestionFour {
    public static void main(String[] args) {
        ArrayList<String> s2 = new ArrayList<>();
        s2.add("Yellow");
        s2.add("Green");
        s2.add("Grey");
        s2.add("Purple");
        s2.add("Red");

        System.out.println(s2.get(1));
    }
}
