package CallableAndFuture;

import java.util.concurrent.Callable;

class Processor implements Callable<String> {

    private int id;

    Processor(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Id: " + id;
    }
}
