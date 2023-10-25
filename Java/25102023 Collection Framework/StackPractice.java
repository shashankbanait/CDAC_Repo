import java.util.Stack;
public class StackPractice {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("Harshal");
        s.push("Miling");
        s.push("Prabhat");
        s.push("Vaibhav");

        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
        s.push("Suraj");
        System.out.println(s);
    }
}