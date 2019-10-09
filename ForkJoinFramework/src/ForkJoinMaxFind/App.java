package ForkJoinMaxFind;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class App {

    static int THREASHOLD = 0;

    public static void main(String[] args) {

        long max = 0;
        long start = 0;
        long[] nums = initializeNums();
        int threads = Runtime.getRuntime().availableProcessors();
        THREASHOLD = nums.length / threads;

        ForkJoinPool forkJoinPool = new ForkJoinPool(threads);
        ParallelMax parallelMax = new ParallelMax(nums, 0, nums.length);

        start = System.currentTimeMillis();
        max = forkJoinPool.invoke(parallelMax);

        System.out.println("Parallel Max: " + max);
        System.out.println("Time taken: " + (System.currentTimeMillis() - start) + " ms");

        System.out.println("------------------");
        SequentialMax sequential = new SequentialMax();

        start = System.currentTimeMillis();
        max = sequential.sequentialMax(nums, nums.length);

        System.out.println("Sequential Max: " + max);
        System.out.println("Time taken: " + (System.currentTimeMillis() - start) + " ms");
    }

    private static long[] initializeNums() {

        int numb = 120000000;
        long[] nums = new long[numb];
        Random random = new Random();

        for (int i = 0; i < numb; ++i)
            nums[i] = random.nextInt(100);

        return nums;
    }
}