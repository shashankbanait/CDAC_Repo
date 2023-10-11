class Outer{
    int x = 10;
    static class InnerStatic{
        int y = 20;
        void show(){
            System.out.println("I'm from static inner class " + y);

            // Agar iske bahar wali class ke variable ko access karna hai to iske andar object banana padega
            Outer obj = new Outer();
            System.out.println("This is static inner class and doing addition of x and y " + (obj.x+y));
        }
    }
}

public class InnerClass{
    public static void main(String[] args) {
        // Inner class ka object kaise banega?
        // ans: iske liye outer class phir . (dot) phir inner class ka naam likhenge
        Outer.InnerStatic obj = new Outer.InnerStatic();
        
     }
}