public interface Interface {
    int a = 10;     // public static final int a = 10

    void showName();    // public abstract void showName
    void showAge();     // asal me ye hai -> public abstract void showAge 

    default void course(){
        System.out.println("Default Method");
    }

    static void institute(){
        
    }
    private void exam(){

    }
    private static void city(){
        
    }
}
