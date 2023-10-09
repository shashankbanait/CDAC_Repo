class Test{
    int a;
    public Test(){
        this(222);
        a = 10;
    }
    public Test(int x){
        a=x;
    }
}
public class thisKeyword {
    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println(t.a);
    }
    
}
