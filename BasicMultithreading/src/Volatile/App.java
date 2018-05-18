package Volatile;

public class App {

    public static void main(String[] args) {

        Worker worker = new Worker();
        Thread thread = new Thread(worker);
        thread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        worker.setTerminated(true);
        System.out.println("Finish");
    }
}
