package Volatile;

class Worker implements Runnable {

    private volatile boolean isTerminated = false;

    @Override
    public void run() {

        while (!isTerminated) {
            System.out.println("Hello, this is a message from the Worker class");

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void setTerminated(boolean isTerminated) {
        this.isTerminated = isTerminated;
    }
}
