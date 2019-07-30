package Semaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 12; i++) {

            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    Downloader.INSTANCY.downloadData();

                }
            });
        }
    }
}