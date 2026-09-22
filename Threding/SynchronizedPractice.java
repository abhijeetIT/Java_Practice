class Counter {
    int count = 0;

    /* void increment() {
        count++;
    }
*/

//this one is lock the fucntion while one using 
synchronized void increment() {  
        count++;
    }

}

public class SynchronizedPractice {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.count);
    }
}



/*Thread 1 reads count

count = 0

Thread 2 reads count

count = 0 (before Thread 1 writes)

Thread 1 writes

count = 1


Thread 2 writes

count = 1 (overwrites Thread 1's update) */