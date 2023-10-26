// Q3. Write a java program to find a name from a collection
// package Lab Task;

import java.util.Vector;

public class QuestionThree {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Harshal");
        v.add("Milind");
        v.add("Prabhu");
        v.add("Saurabh");

        System.out.println(v.contains("Milind"));
        System.out.println(v);
    }
}
