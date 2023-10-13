public class IlandOfIsolation {
    IlandOfIsolation i;
    protected void finalize(){
        System.out.println("Object is destroyed");
    }

    public static void main(String[] args) {
        IlandOfIsolation t1 = new IlandOfIsolation();
        IlandOfIsolation t2 = new IlandOfIsolation();

        t1.i = t2;
        t2.i = t1;

        t1 = null;
        t2 = null;
        

        System.gc();
    }
    
}
