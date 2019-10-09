package ConcurrentCollections.DelayQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

public class App {
    public static void main(String[] args) {

        BlockingQueue<DelayedWorker> blockingQueue = new DelayQueue<DelayedWorker>();

        try {
            blockingQueue.put(new DelayedWorker(1000, "This is message #1"));
            blockingQueue.put(new DelayedWorker(10000, "This is message #2"));
            blockingQueue.put(new DelayedWorker(4000, "This is message #3"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (!blockingQueue.isEmpty()) {
            try {
                System.out.println(blockingQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}