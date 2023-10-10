import java.util.Scanner;
abstract class LivingThing{
    void eyes(){
        System.out.println("Two Eyes");
    }
    void mouth(){
        System.out.println("One mouth");
    }
    abstract void legs();
}

class Human extends LivingThing{
    @Override
    void legs() {
        System.out.println("Two legs");
    }
    
}

class Animal extends LivingThing{
    @Override
    void legs() {
        System.out.println("Four legs");
    }

}


public class Abstraction{
    static void showProperty(LivingThing t){
        t.eyes();
        t.mouth();
        t.legs();
    }
    public static void main(String[] args) {

        /*
        
        LivingThing lt;
        System.out.println("property of human");
        lt = new Human();
        lt.eyes();
        lt.mouth();
        lt.legs();

        System.out.println("*******************************************************************");
        System.out.println("property of animal");
        lt = new Animal();
        lt.eyes();
        lt.mouth();
        lt.legs();

        */

        System.out.println("Whose property do you wanna know: ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        if(choice.equals("Human")){
            System.out.println("Property of human");
            showProperty(new Human());
        }
        else{
            System.out.println("Property of animal");
            showProperty(new Animal());
        }
    }
}