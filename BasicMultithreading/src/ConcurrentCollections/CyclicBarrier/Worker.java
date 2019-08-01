package ConcurrentCollections.CyclicBarrier;

import java.util.Random;
import java.util.concurrent.*;

class Worker implements Runnable {

    private int id;
    private CyclicBarrier cyclicBarrier;
    private Random random;

    Worker(int id, CyclicBarrier cyclicBarrier) {
        this.id = id;
        this.cyclicBarrier = cyclicBarrier;
        this.random = new Random();
    }

    public void run() {
        doWork();
    }

    private void doWork() {

        System.out.println("Thread with id " + this.id + " starts working...");

        try {
            Thread.sleep(random.nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread with id " + this.id + " finished...");

        try {
            cyclicBarrier.await();
            System.out.println("After await...");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
