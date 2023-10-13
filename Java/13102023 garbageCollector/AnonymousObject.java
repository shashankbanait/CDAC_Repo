public class AnonymousObject {
    protected void finalize(){
        System.out.println("Object is detroyed");
    }
    public static void main(String[] args) {
        new AnonymousObject();
        System.gc();
    }
}