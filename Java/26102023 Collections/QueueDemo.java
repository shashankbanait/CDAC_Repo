import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Collections;

public class QueueDemo {
    // FIFO

    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>();
        q.add("Ramesh");
        q.add("Suresh");
        q.add("Bhavesh");
        q.add("Bablu");
        q.add("Dablu");

        System.out.println("Automatically sort ho gyi hai queue "+q);

        String p = q.poll();
        System.out.println("Poll kiya hua element............. "+p);
        
    }
    
}
