// 1.Build a class which has references to other classes. Instantiate these reference variables and invoke instance methods.
class One{
    public void oneMethod(){
        System.out.println("This method is in One class");
    }
}
class Two{
    public void twoMethod(){
        System.out.println("This method is in Two class");
    }
}
public class First{
    public static void main(String[] args){
        One oneobj = new One();
        Two twoobj = new Two();
        
        oneobj.oneMethod();
        twoobj.twoMethod();
    }
}