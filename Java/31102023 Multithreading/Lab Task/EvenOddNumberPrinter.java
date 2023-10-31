public class EvenOddNumberPrinter {
    public static void main(String[] args) {
        // Creating instances for even and odd number printers
        EvenNumberPrinter evenNumberPrinter = new EvenNumberPrinter();
        OddNumberPrinter oddNumberPrinter = new OddNumberPrinter();

        // Creating two threads
        Thread evenThread = new Thread(evenNumberPrinter);
        Thread oddThread = new Thread(oddNumberPrinter);

        // Starting the threads
        evenThread.start();
        oddThread.start();
    }
}

class EvenNumberPrinter implements Runnable {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddNumberPrinter implements Runnable {
    public void run() {
        for (int i = 1; i <= 19; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}
