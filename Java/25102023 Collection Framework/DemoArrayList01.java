import java.util.ArrayList;
import java.util.List;
public class DemoArrayList01 {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(23);
        // lst.add(34.38);         // will give errors because it is Integer type
        lst.add(12);
        lst.add(22);
        lst.add(14);
        lst.add(62);
        System.out.println(lst);
    }
    
}
