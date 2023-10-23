import java.lang.ref.Reference;

public class TestWrapper{
    public static void main(String[] args) {
        int x = 10;
        /*
        Integer i = new Integer(x);     // Boxing
        int a = i.intValue();           // Unboxing
        System.out.println("Primitive x = " + x);
        System.out.println("Reference x= " + i);
        */

        Integer i = x;      // Autoboxing
        int a = x;          // Autounboxing


        // String to corresponding numeric value
        String age = "25";
        int age1 = Integer.parseInt(age);
        System.out.println(age1+5);         // 30 aayega jo ki sahi hai
    }
}