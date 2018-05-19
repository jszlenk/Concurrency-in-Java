package SynchronizedBlock;

import static SynchronizedBlock.Count.getPrintln;

public class App {
    public static void main(String[] args) {

        Thread thread1 = new Thread(Compute::compute);
        Thread thread2 = new Thread(Compute::compute);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        getPrintln();
    }
}