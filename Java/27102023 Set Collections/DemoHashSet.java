import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
public class DemoHashSet {
    public static void main(String[] args) {
        // Set<Integer> st = new HashSet<>();
        Set<Integer> st = new TreeSet<>();   // treeset order maintain karta hai
        st.add(70);
        st.add(30);
        st.add(50);
        st.add(40);
        System.out.println(st);

        for(Integer i: st){
            System.out.println(i);
        }
    }
}
