package ConcurrentMaps;

import java.util.concurrent.ConcurrentMap;

class SecondWorker implements Runnable {

    private ConcurrentMap<String, Integer> map;

    SecondWorker(ConcurrentMap<String, Integer> map) {
        this.map = map;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(5000);
            System.out.println(map.get("A"));
            Thread.sleep(1000);
            System.out.println(map.get("E"));
            System.out.println(map.get("B"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
