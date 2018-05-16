package SequentialProcessing;

public class App {
    public static void main(String[] args) {

        One one = new One();
        Two two = new Two();

        one.start();
        two.start();

        try {
            one.join();
            two.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("I have completed all tasks.");
    }
}
