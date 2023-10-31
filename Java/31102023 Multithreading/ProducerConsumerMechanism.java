import java.util.Vector;
import java.util.*;

class Producer implements Runnable{
    private final Vector buffer;
    private final int SIZE;
    
    public Producer(Vector buffer, int size) {
        this.buffer = buffer;
        SIZE = size;
    }

    public void produce(){
        if(buffer.size()==SIZE){
            System.out.println("the buffer is full and waiting to consume item");
        }

    }

    @Override
    public void run() {
        for(int i=1; i<10; i++){
            
        }
    }
}
class Consumer implements Runnable{
    private final Vector buffer;
    private final int SIZE;
    
    public Consumer(Vector buffer, int size) {
        this.buffer = buffer;
        SIZE = size;
    }

    @Override
    public void run() {
        
    }
}
public class ProducerConsumerMechanism {
    public static void main(String[] args) {
        Vector buff = new Vector<>();
        int size = 5;
        Producer prod = new Producer(buff, size);
        Consumer cons = new Consumer(buff, size);

        Thread t1 = new Thread(prod);
        Thread t2 = new Thread(cons);

        t1.start();
        t2.start();
    }
}