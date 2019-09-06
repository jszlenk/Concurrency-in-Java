package ConcurrentCollections.PriorityBlockingQueue;

import java.util.concurrent.BlockingQueue;

class SecondWorker2 implements Runnable {

    private BlockingQueue<String> blockingQueue;

    SecondWorker2(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(blockingQueue.take());
            Thread.sleep(1000);
            System.out.println(blockingQueue.take());
            Thread.sleep(1000);
            System.out.println(blockingQueue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}