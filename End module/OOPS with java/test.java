import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[]) throws Exception {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] z = s.split("o");
        int zCount = z[0].length();
        String[] o = s.split("z");
        int oCount = o[zCount].length();
        if (zCount * 2 == oCount) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
