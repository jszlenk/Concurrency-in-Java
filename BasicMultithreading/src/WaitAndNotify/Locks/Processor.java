package WaitAndNotify.Locks;

import java.util.ArrayList;
import java.util.List;

class Processor {

    private List<Integer> list = new ArrayList<>();
    private final Object lock = new Object();
    private int value = 0;

    void producer() throws InterruptedException {

        synchronized (lock) {

            while (true) {

                int LIMIT = 5;
                if (list.size() == LIMIT) {
                    System.out.println("Waiting for removing items form the list...");
                    lock.wait();
                } else {
                    System.out.println("Adding: " + value);
                    list.add(value);
                    value++;
                    lock.notify();
                }

                Thread.sleep(500);
            }
        }
    }

    void consumer() throws InterruptedException {

        synchronized (lock) {

            while (true) {

                int BOTTOM = 0;
                if (list.size() == BOTTOM) {
                    System.out.println("Waiting for removing items form the list2...");
                    lock.wait();
                } else {
                    System.out.println("Removed: " + list.remove(--value));
                    lock.notify();
                }

                Thread.sleep(500);

            }
        }
    }
}
