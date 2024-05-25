class Counter{
    int count;
    
    public synchronized void increament(){
        count++;
    }
}


public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable r1 = () -> {
            
            for(int i = 0; i <1000; i++)
            {
                c.increament();
            }
        };

        Runnable r2 = () -> {
            
            for(int i = 0; i <1000; i++)
            {
                c.increament();
            }
        };

        
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
