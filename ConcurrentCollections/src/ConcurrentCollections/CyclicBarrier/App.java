package ConcurrentCollections.CyclicBarrier;


import java.util.concurrent.*;

public class App {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CyclicBarrier barrier = new CyclicBarrier(5, () -> System.out.println("All the tasks are finished..."));

        for (int i = 0; i < 5; ++i) {
            executorService.execute(new Worker(i + 1, barrier));
        }

        executorService.shutdown();
    }
}
