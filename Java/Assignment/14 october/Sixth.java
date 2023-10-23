// 6.Write a java program to create a demo application to understand the role of access modifiers.
// A class to demonstrate access modifiers
class AccessModifiersDemo {
    // Public field can be accessed from anywhere
    public String a = "This is a public variable";

    // Private field can only be accessed within this class
    private String b = "This is a private variable";

    // Protected field can be accessed within the same package and subclasses
    protected String c = "This is a protected variable";

    // Default (package-private) field can be accessed within the same package
    String d = "This is a default variable";

    // Constructor
    public AccessModifiersDemo() {
        System.out.println("AccessModifiersDemo Constructor");
    }

    // Public method can be accessed from anywhere
    public void a() {
        System.out.println("This is a public method");
    }

    // Private method can only be accessed within this class
    private void b() {
        System.out.println("This is a private method");
    }

    // Protected method can be accessed within the same package and subclasses
    protected void c() {
        System.out.println("This is a protected method");
    }

    // Default (package-private) method can be accessed within the same package
    void d() {
        System.out.println("This is a default method");
    }
}

public class Sixth {
    public static void main(String[] args) {
        AccessModifiersDemo demo = new AccessModifiersDemo();

        // Accessing public members
        System.out.println(demo.a);
        demo.a();

        // Private members are not accessible outside the class
        // System.out.println(demo.b); // It will give compile-time error
        // demo.b(); // It will also give compile-time error

        // Accessing protected members within the same package
        System.out.println(demo.c);
        demo.c();

        // Accessing default (package-private) members within the same package
        System.out.println(demo.d);
        demo.d();
    }
}
