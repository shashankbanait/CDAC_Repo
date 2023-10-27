// package Concurrency;
// This code has some issues with newer version of java it is perfectly working in java 8
// Screenshot is attached outside
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Concurrency {
    public static void main(String[] args) throws InterruptedException {
        // HashMap<Integer, String> mp = new HashMap<>();

        ConcurrentHashMap<Integer, String> mp = new ConcurrentHashMap<>();

        mp.put(101, "Ramesh");
        mp.put(102, "Suresh");
        mp.put(103, "Dinesh");

        Runnable task = () -> {
            for (int i = 104; i <= 106; i++) {
                mp.put(i, "Value " + i);
            }
        };

        Thread th1 = new Thread(task);
        Thread th2 = new Thread(task);

        th1.start();
        th2.start();

        th1.join();
        th1.join();

        /*
        try{
            th1.join(); 
            th2.join(); 
        }
        catch(Exception e){
            System.out.println("Some error");
        }
        */
        System.out.println(mp);
    }
}
