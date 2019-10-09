package BlockingQueue;

import java.util.concurrent.BlockingQueue;

class FirstWorker implements Runnable {

    private BlockingQueue<String> blockingQueue;

    FirstWorker(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        try {
            blockingQueue.put("A");
            Thread.sleep(1000);
            blockingQueue.put("B");
            Thread.sleep(1000);
            blockingQueue.put("C");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}