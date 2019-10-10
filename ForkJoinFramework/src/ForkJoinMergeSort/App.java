package ForkJoinMergeSort;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class App {

    public static void main(String[] args) {

        long start;
        int[] nums = initializeNums();
        int[] parallelnums = nums.clone();

        SequentialMergeSort sequentialMergesort = new SequentialMergeSort();

        start = System.currentTimeMillis();
        sequentialMergesort.mergeSort(nums);
        System.out.println("Sequential sort: " + (System.currentTimeMillis() - start) + " ms");

        ParallelMergeSort parallelMergeSort = new ParallelMergeSort(parallelnums);
        ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());

        start = System.currentTimeMillis();
        forkJoinPool.invoke(parallelMergeSort);
        System.out.println("Parallel sort: " + (System.currentTimeMillis() - start) + " ms");
    }

    private static int[] initializeNums() {

        Random random = new Random();
        int[] nums = new int[10000000];

        for (int i = 0; i < 10000000; ++i) {
            nums[i] = random.nextInt(10);
        }
        return nums;
    }
}