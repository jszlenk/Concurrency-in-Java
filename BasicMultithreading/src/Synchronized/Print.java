package Synchronized;

import static Synchronized.Increment.getCounter;

class Print {
    private static int counter = getCounter();

    static void getPrintln() {
        System.out.println(counter);
    }
}
