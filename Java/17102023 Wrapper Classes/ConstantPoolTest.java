public class ConstantPoolTest {
    public static void main(String[] args) {
        // For Integer family -128 to 127
        Byte b1 = Byte.valueOf("50");
        Byte b2 = Byte.valueOf("50");
        System.out.println(b1==b2);     // returns true kyuki ye constant pool me banta hai new object nhi banta

        // Byte b3 = Byte.valueOf("-129");
        // Byte b4 = Byte.valueOf("-129");
        // System.out.println(b3==b4);     // gives runtime exception kyuki range ke bahar hai
        
        Short b5 = Short.valueOf("-128");
        Short b6 = Short.valueOf("-128");
        System.out.println(b5==b6);         // returns true kyuki same hai aur object ek hi baar bana hai 
        // aur vo bhi constant pool me isliye dono reference ek hi object ko point kar rhe hai

        Boolean b7 = Boolean.valueOf("false");
        Boolean b8 = Boolean.valueOf("false");
        System.out.println(b7 == b8);   // returns true kyuki pass ki value same hai aur constant pool me ek hi jagah point kar rhi hai


        Float f1 = Float.valueOf("23.53");
        Float f2 = Float.valueOf("23.53");
        System.out.println(f1 == f2);       // returns false kyuki constant pool iske liye applicable nhi hai


        // Range for character for constant pool '\u0000' to '\u007f'
        Character c1 = Character.valueOf('A');
        Character c2 = Character.valueOf('A');
        System.out.println(c1==c2);     // true aayega kyuki ye range me hai

        Character c3 = Character.valueOf('\u0950');
        Character c4 = Character.valueOf('\u0950');
        System.out.println(c3==c4);     // false aayega kyuki range se bahar hai
    }
    
}
