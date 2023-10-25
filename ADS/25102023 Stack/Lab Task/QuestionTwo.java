// Q2.Write a Java program to iterate through all elements in an array list.
// package Lab Task;
import java.util.ArrayList;
import java.util.Iterator;
public class QuestionTwo {
    public static void main(String[] args) {
        ArrayList<String> s1 = new ArrayList<>();
        s1.add("Yellow");
        s1.add("Green");
        s1.add("Grey");
        s1.add("Purple");
        s1.add("Red");


        Iterator it = s1.iterator();

        while(it.hasNext()){
            System.out.println(it.next() + " ");
        }
    }
}
