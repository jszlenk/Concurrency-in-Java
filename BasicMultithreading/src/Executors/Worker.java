package Executors;

class Worker implements Runnable {

    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
