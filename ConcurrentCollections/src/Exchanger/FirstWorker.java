package Exchanger;

import java.util.concurrent.Exchanger;

class FirstWorker implements Runnable {

    private int counter;
    private Exchanger<Integer> exchanger;

    FirstWorker(Exchanger<Integer> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {

        while (true) {

            counter = counter + 1;
            System.out.println("FirstWorker incremented the counter: " + counter);

            try {
                counter = exchanger.exchange(counter);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
