public class DeadlockDemo {
    public static void main(String[] args) {
        String rec1 = "Aman";
        String rec2 = "Suman";
        Thread t1 = new Thread(){

            @Override
            public void run() {
                synchronized(rec1){
                    System.out.println("Thread 2 uses Resourse 2" + rec2);
                    try {
                        sleep(100);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                    
                }   
                synchronized(rec1){
                    System.out.println("Thread 1 uses Resourse 1" + rec1);
                    } 
                                
            }            
        };

    }
    
}
