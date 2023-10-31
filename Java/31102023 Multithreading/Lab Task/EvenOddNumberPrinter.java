// Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20
// package Lab Task;

public class EvenOddNumberPrinter {

    public static void main(String[] args) {
        EvenOddPrinter evenOddPrinter = new EvenOddPrinter();

        Thread evenThread = new Thread(() -> evenOddPrinter.printEven());
        Thread oddThread = new Thread(() -> evenOddPrinter.printOdd());

        evenThread.start();
        oddThread.start();
    }
}

class EvenOddPrinter {
    public void printEven() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
        }
    }

    public void printOdd() {
        for (int i = 1; i <= 19; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}
