package WaitAndNotify.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Increment {

    private static long counter = 0;
    private static Lock lock = new ReentrantLock();

    private static void increment() {

        lock.lock();

        try {
            long i;
            for(i = 0; i<1000000000; i++) {
                counter++;
            }

        } finally {
            lock.unlock();

        }
    }


    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                increment();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter is: " + counter);


    }
}
