package ConcurrentCollections.ConcurrentMaps;

import java.util.concurrent.ConcurrentMap;

class FirstWorker implements Runnable {

    private ConcurrentMap<String, Integer> map;

    FirstWorker(ConcurrentMap<String, Integer> map) {
        this.map = map;
    }

    @Override
    public void run() {

        try {
            map.put("B",1);
            map.put("H",2);
            Thread.sleep(1000);
            map.put("F",3);
            map.put("A",4);
            Thread.sleep(1000);
            map.put("E",5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}