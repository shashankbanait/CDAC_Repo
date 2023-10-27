import java.util.ArrayList;
import java.util.List;

public class BackupDemo {
    public static void main(String[] args) {
        List<Integer> originallst = new ArrayList<>();
        originallst.add(100);
        originallst.add(200);
        originallst.add(300);
        
        List<Integer> backuplst = originallst.subList(0, originallst.size());
        System.out.println("This is original");
        System.out.println(originallst);
        System.out.println("This is backup");
        System.out.println(backuplst);

        System.out.println("*************Backup me add karenge to original me bhi ho jayega**********");
        System.out.println("**********Lekin iska vice versa possible nhi hai***************");
        backuplst.add(500);
        System.out.println("This is again original after adding new value");
        System.out.println(originallst);
        System.out.println("This is backup ");
        System.out.println(backuplst);
        System.out.println("**************************");
        System.out.println("Agar original me add karenge to backup me add nhi hoga");
        System.out.println("Original list after adding new element");
        originallst.add(600);
        System.out.println(originallst);
        System.out.println("original me add kiya to ab backup print nhi ho par rhi hai");
        // System.out.println(backuplst);       // giving errors
    }
    
}
