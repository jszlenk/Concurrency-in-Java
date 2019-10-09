package PriorityBlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class App {
    public static void main(String[] args) {

        BlockingQueue<String> queue = new PriorityBlockingQueue<>();
        FirstWorker2 firstWorker = new FirstWorker2(queue);
        SecondWorker2 secondWorker = new SecondWorker2(queue);

        new Thread(firstWorker).start();
        new Thread(secondWorker).start();
    }
}
