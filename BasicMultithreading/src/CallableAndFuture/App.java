package CallableAndFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class App {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Future<String>> list = new ArrayList<>();

        for (int i = 0; i < 5; ++i) {
            Future<String> future = executorService.submit(new Processor(i + 1));
            list.add(future);
        }

        for (Future<String> future : list) {

            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }

        }
        executorService.shutdown();
    }
}
