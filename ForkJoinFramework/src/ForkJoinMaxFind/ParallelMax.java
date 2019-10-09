package ForkJoinMaxFind;

import java.util.concurrent.RecursiveTask;

public class ParallelMax extends RecursiveTask<Long> {

    private long[] nums;
    private int lowIndex;
    private int highIndex;

    ParallelMax(long[] nums, int lowIndex, int highIndex) {
        this.highIndex = highIndex;
        this.lowIndex = lowIndex;
        this.nums = nums;
    }

    @Override
    protected Long compute() {

        if (highIndex - lowIndex < App.THREASHOLD) {
            return sequentialMax();
        } else {

            int middleIndex = (lowIndex + highIndex) / 2;

            ParallelMax left = new ParallelMax(nums, lowIndex, middleIndex);
            ParallelMax righ = new ParallelMax(nums, middleIndex, highIndex);

            invokeAll(left, righ);

            return Math.max(left.join(), righ.join());
        }
    }

    private long sequentialMax() {

        long max = nums[0];

        for (int i = lowIndex; i < highIndex; ++i)
            if (nums[i] > max)
                max = nums[i];

        return max;
    }
}