public class ObjectDetroyed {
    @Override
    public void finalize(){
        System.out.println("Object is detroyed");
    }
    public static void main(String[] args) {
        ObjectDetroyed t1 = new ObjectDetroyed();
        t1 = null;
        System.gc();
    }
    
}
