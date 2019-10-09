package RecursiveTask;

import java.util.concurrent.RecursiveTask;

public class ExampleRecursiveTask extends RecursiveTask<Integer> {

    private int numb;
    private int one = 0;
    private int two = 0;

    ExampleRecursiveTask(int numb) {
        this.numb = numb;
    }

    @Override
    protected Integer compute() {

        if (numb > 100) {

            System.out.println("Parallel execution and split the tasks: " + numb);

            ExampleRecursiveTask exampleRecursiveTask = new ExampleRecursiveTask(numb / 2);
            ExampleRecursiveTask exampleRecursiveTask2 = new ExampleRecursiveTask(numb / 2);

            exampleRecursiveTask.fork();
            exampleRecursiveTask2.fork();

            one += exampleRecursiveTask.join();
            two += exampleRecursiveTask2.join();

            return one + two;

        } else {
            return 2 * numb;
        }
    }
}