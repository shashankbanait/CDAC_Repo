// Q5.Write a Java program to sort a given array list.
// package Lab Task;
import java.util.ArrayList;
import java.util.Collections;
public class QuestionFive {
    public static void main(String[] args) {
        ArrayList<String> s2 = new ArrayList<>();
        s2.add("Yellow");
        s2.add("Green");
        s2.add("Grey");
        s2.add("Purple");
        s2.add("Red");
        
        System.out.println("Before sort: "+s2);
        Collections.sort(s2);
        System.out.println("After sort: "+s2);
    }
}
