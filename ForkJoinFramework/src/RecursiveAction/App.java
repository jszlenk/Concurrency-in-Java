package RecursiveAction;

import java.util.concurrent.ForkJoinPool;

public class App {

    public static void main(String[] args) {

        ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());

        ExampleRecursiveAction exampleRecursiveAction = new ExampleRecursiveAction(400);
        forkJoinPool.invoke(exampleRecursiveAction);
    }
}