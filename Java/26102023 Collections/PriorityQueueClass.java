import java.util.PriorityQueue;
import java.util.Vector;

public class PriorityQueueClass {
    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<>();
        q.add("Ramesh");
        q.add("Suresh");
        q.add("Dinesh");
        q.add("Mahesh");
        q.add("Bhavesh");

        System.out.println(q);

        // for(String s: q){
        //     String p = q.poll();
        //     System.out.println(p);
        // }

        String s = q.poll();
        System.out.println(s);
        String s1 = q.poll();
        System.out.println(s1);
        String s2 = q.poll();
        System.out.println(s2);
        String s3 = q.poll();
        System.out.println(s3);
        String s4 = q.poll();
        System.out.println(s4);

        

        
    }
    
}
