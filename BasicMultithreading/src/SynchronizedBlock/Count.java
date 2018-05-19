package SynchronizedBlock;

class Count {
    private static int count1 = 0;
    private static int count2 = 0;

    synchronized static void add() {
        count1++;
    }

    synchronized static void addAgain() {
        count2++;
    }

    static void getPrintln() {
        System.out.println("Count1 = " + count1 + " and Count2 = " + count2);
    }
}
