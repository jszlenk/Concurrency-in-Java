package ConcurrentCollections.PriorityBlockingQueue;

import java.util.concurrent.BlockingQueue;

class FirstWorker2 implements Runnable {

    private BlockingQueue<String> blockingQueue;

    FirstWorker2(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        try {
            blockingQueue.put("B");
            blockingQueue.put("H");
            blockingQueue.put("F");
            blockingQueue.put("G");
            Thread.sleep(1000);
            blockingQueue.put("A");
            Thread.sleep(1000);
            blockingQueue.put("E");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}