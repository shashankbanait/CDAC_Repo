/* 2.Write a Java program to create an abstract class Person with abstract methods
eat() and exercise(). Create subclasses Athlete and LazyPerson that extend the
Person class and implement the respective methods to describe how each
person eats and exercises.
 */

abstract class Person{
    abstract void eat();
    abstract void exercise();

}

class Athlete extends Person{
    public void eat() {
        System.out.println("Athlete eating.");
    }

    public void exercise() {
        System.out.println("Athlete exercises");
    }
}

class LazyPerson extends Person {
    public void eat() {
        System.out.println("Lazy person eating.");
    }

    public void exercise() {
        System.out.println("Lazy person don't do exercise.");
    }
}


public class QuestionTwo {
    public static void main(String[] args) {
        Athlete athlete = new Athlete();
        LazyPerson lazyPerson = new LazyPerson();

        System.out.println("Athlete class");
        athlete.eat();
        athlete.exercise();

        System.out.println();

        System.out.println("LazyPerson class");
        lazyPerson.eat();
        lazyPerson.exercise();
    }
    
}
