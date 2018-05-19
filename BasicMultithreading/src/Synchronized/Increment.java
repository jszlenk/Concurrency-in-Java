package Synchronized;

class Increment {
    private static int counter = 0;
    static synchronized void increment() {
        ++counter;
    }

    static int getCounter() {
        return counter;
    }
}
