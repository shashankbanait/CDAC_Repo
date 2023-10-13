public class Test{
    String objName;
    private static void display(){
        Test t2 = new Test("t2");
    }
    public Test(String objName){
        this.objName = objName;
    }
    static void show(){
        Test t1 = new Test("t1");
    }
    
    @Override
    protected void finalize() throws Exception{
        System.out.println(objName + " is detroyed ");
    }

    public static void main(String[] args) {
        show();
        System.gc();
    }
}