import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DemoArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(23);
        lst.add(12);
        lst.add(22);
        lst.add(14);
        lst.add(62);

        System.out.println(lst);
        // Sorting using Collections
        Collections.sort(lst);

        // System.out.println(lst);

        int pos = Collections.binarySearch(lst, 23);
        System.out.println(pos);

        /*
        System.out.println("*****************************");
        for(Integer i : lst){
            System.out.println(i);
        }
        */
    }
}