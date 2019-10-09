package Exchanger;

import java.util.concurrent.Exchanger;

public class App {
    public static void main(String[] args) {

        Exchanger<Integer> exchanger = new Exchanger<>();

        new Thread(new FirstWorker(exchanger)).start();
        new Thread(new SecondWorker(exchanger)).start();
    }
}
