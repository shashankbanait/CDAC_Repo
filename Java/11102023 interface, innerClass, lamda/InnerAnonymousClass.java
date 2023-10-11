// class ParentOfAnnonymous{
//     void greeting(){
//         System.out.println("Say Hello.........");
//     }
// }

// @FunctionalInterface
Interface ParentOfAnnonymous{
    public void greeting();
    void show();
}

class OuterOfAnnonymous{
    ParentOfAnnonymous p2 = new ParentOfAnnonymous();
    ParentOfAnnonymous p = new ParentOfAnnonymous(){
        @Override
        void greeting() {
            System.out.println("Say Namaste.............");
        }
        @Override
        public void shwo(){
            throw new UnsupportedOperationException("Not supported yet")
        }
    };
}

public class InnerAnonymousClass {
    public static void main(String[] args) {
        OuterOfAnnonymous o = new OuterOfAnnonymous();
        o.p.greeting();
    }
    
}
