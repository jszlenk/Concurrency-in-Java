package WaitAndNotify;

class Processor {

    void produce() throws InterruptedException {

        synchronized (this) {
            System.out.println("We are in the producer method...");
            wait();
            System.out.println("Again producer method...");
        }
    }

    void consume() throws InterruptedException {

        Thread.sleep(1000);

        synchronized (this) {
            System.out.println("Consumer method...");
            notify();
            Thread.sleep(2000);
        }
    }
}