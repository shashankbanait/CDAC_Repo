public class ObjectInsideMethod {
    private static void display() {
        ObjectInsideMethod t2 = new ObjectInsideMethod("t2 ");
    }

    String objName;

    public ObjectInsideMethod(String objName) {
        this.objName = objName;
    }

    static void show() {
        ObjectInsideMethod t1 = new ObjectInsideMethod("t1 ");
        display();
    }

    @Override
    protected void finalize() {
        System.out.println(this.objName + "is free from memory");
    }

    public static void main(String[] args) {
        show();
        System.gc();
    }
}