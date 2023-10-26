import java.util.ArrayList;
import java.util.Collections;

public class methodsInCollections {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(23);
        lst.add(12);
        lst.add(22);
        lst.add(14);
        lst.add(62);
        
        ArrayList<Integer> lst2 = new ArrayList<>();
        lst2.add(100);
        lst2.add(200);
        lst2.add(300);
        
        // Copy method in collections
        Collections.copy(lst2, lst);        // IndexOutOfBoundsException: Source does not fit in destination
        Collections.copy(lst, lst2);
        System.out.println(lst);

        
    }
}
