// 7.Write a Java program to demonstrate multiple inner classes(Member,Local and Anonymous Inner class).

public class Seventh {

    class MemberInner {
        public void display() {
            System.out.println("This is a Member Inner class.");
        }
    }

    public void showMemberInner() {
        MemberInner inner = new MemberInner();
        inner.display();
    }

    public void demonstrateLocalInner() {
        class LocalInner {
            public void display() {
                System.out.println("This is a Local Inner class.");
            }
        }

        LocalInner inner = new LocalInner();
        inner.display();
    }

    public void demonstrateAnonymousInner() {
        Runnable anonymousInner = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is an Anonymous Inner class.");
            }
        };

        Thread thread = new Thread(anonymousInner);
        thread.start();
    }

    public static void main(String[] args) {
        Seventh demo = new Seventh();
        demo.showMemberInner();
        demo.demonstrateLocalInner();
        demo.demonstrateAnonymousInner();
    }
}
