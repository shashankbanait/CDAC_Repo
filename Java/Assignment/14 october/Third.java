
/*
 * 3.Write a Java program to create an abstract class Instrument with abstract methods play() and
tune(). Create subclasses for Piano and Guitar that extend the Instrument class and implement
the respective methods to play and tune each instrument
 */
import java.util.Scanner;

abstract class Instrument {
    abstract void play();

    abstract void tune();

}

class Piano extends Instrument {
    void play() {
        System.out.println("Playing the piano.....");

    }

    void tune() {
        System.out.println("Tuning the piano...");
    }

}

class Guitar extends Instrument {
    void play() {
        System.out.println("Playing the guitar...");

    }

    void tune() {
        System.out.println("Tuning the guitar...");

    }

}

public class Third {
    public static void main(String[] args) {

        Instrument piano = new Piano();
        Instrument guitar = new Guitar();

        piano.tune();
        piano.play();

        guitar.tune();
        guitar.play();

    }
}