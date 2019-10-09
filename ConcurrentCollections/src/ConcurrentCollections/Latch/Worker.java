package ConcurrentCollections.Latch;

import java.util.concurrent.CountDownLatch;

class Worker implements Runnable {

    private int id;
    private CountDownLatch countDownLatch;

    Worker(int id, CountDownLatch countDownLatch) {
        this.id = id;
        this.countDownLatch = countDownLatch;
    }

    public void run() {
        doWork();
        countDownLatch.countDown();
    }

    private void doWork() {
        System.out.println("Thread with id " + this.id + " starts working...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}