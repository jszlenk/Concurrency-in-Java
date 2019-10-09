package RecursiveTask;

import RecursiveAction.ExampleRecursiveAction;

import java.util.concurrent.ForkJoinPool;

public class App {

    public static void main(String[] args) {

        ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());

        ExampleRecursiveTask exampleRecursiveTask = new ExampleRecursiveTask(400);
        Integer result = forkJoinPool.invoke(exampleRecursiveTask);
        System.out.println(result);
    }
}