class Outer{
    int x = 100;
    class Inner{
        int y = 200;
        void display(){
            System.out.println("This is non static inner class and printing x = "+ x + " and y = " + y);
        }
    }
}
public class InnerNonStaticClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner obj = o.new Inner();
        obj.display();
    }
}