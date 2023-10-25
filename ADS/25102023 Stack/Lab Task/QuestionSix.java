// Q6. Create a list of java defined wrapper classes and perform insert/delete/search/iterate/sort operations..
// package Lab Task;
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
public class QuestionSix {
    public static void main(String[] args) {
        ArrayList<String> s2 = new ArrayList<>();
        s2.add("Yellow");
        s2.add("Green");
        s2.add("Grey");
        s2.add("Purple");
        s2.add("Red");
        
        // Sorting
        System.out.println("Before sort: "+s2);
        Collections.sort(s2);
        System.out.println("After sort: "+s2);

        // Iterating
        Iterator it = s2.iterator();

        while(it.hasNext()){
            System.out.println(it.next() + " ");
        }

        // insert
        s2.add("Pink");

        // delete
        s2.remove("Grey");
        System.out.println(s2);

        System.out.println(s2.contains("Pink"));
    }
}
