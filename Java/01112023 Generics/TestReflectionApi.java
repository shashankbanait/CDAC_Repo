public class TestReflectionApi {
    private String name; 
    private int age;
    
    public TestReflectionApi(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo(){
        System.out.println("hello "+ name + " this is your age "+ age);
    }

    public static void main(String[] args) throws NoSuchMethodException {
        // Create class Reference
        Class personCls = Person.class;

        personCls.getDeclaredConstructors();
        Object object = cons.newInstance("Ramesh");
    }
    
}
