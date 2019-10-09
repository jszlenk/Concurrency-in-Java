package AtomicInteger;

class AtomThread implements Runnable {

    private String name;

    AtomThread(String n) {
        name = n;
    }

    public void run() {
        for (int i = 1; i <= 3; i++)
            System.out.println("Thread: " + name + " has: " + Ai.ai.getAndSet(i));
    }
}