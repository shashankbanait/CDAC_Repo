public class AnonymousClass {
    protected void finalize(){
        System.out.println("Object is  destroyed");
    }
    public static void main(String[] args) {
        new AnonymousClass();
        System.gc();
    }
}