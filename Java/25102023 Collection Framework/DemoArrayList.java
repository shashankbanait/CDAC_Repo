import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class DemoArrayList{
    public static void main(String[] args) {
        List lst1 = new ArrayList<>();
        lst1.add('1');
        lst1.add('2');
        List lst = new ArrayList();
        lst.add('D');
        lst.add('A');
        lst.add('B');
        lst.add('D');

        lst.add(3, 'C');                // not efficient kyuki bich me add kar rha hai
        System.out.println(lst);

        // Adds one list into another
        lst.addAll(lst1);
        System.out.println(lst);

        System.out.println(lst.contains('A'));

        // For accessing the elements
        for(Object o : lst){
            System.out.println(o);
        }

        System.out.println("*******************************");
        // Accessing the elements using iterator
        Iterator it = lst.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}