class Parent {
    private int num = 5;
    public void show() {
        System.out.println("This is the parent class." + num + " is my digit");
    }
}

class Child extends Parent {
    int num = 10;
    
    
    public void show() {
        super.show();
        System.out.println("This is the child class." + num + " is my digit");
    }


    public void greet() {
        System.out.println("Hello this is child class!");
    }
}

public class QuestionOne {
    public static void main(String[] args) {
        Child child = new Child();
        Child p = new Child();
        child.show();

        child.greet(); 
    }
}
