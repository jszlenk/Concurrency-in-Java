package ForkJoinMergeSort;

import java.util.Arrays;
import java.util.concurrent.RecursiveAction;

public class ParallelMergeSort extends RecursiveAction {

	private int[] nums;

	ParallelMergeSort(int[] nums) {
		this.nums = nums;
	}

	@Override
	protected void compute() {

		if (nums.length <= 100) {
			mergeSort(nums);
			return;
		}

		int mid = nums.length / 2;

		int[] left = Arrays.copyOfRange(nums, 0, mid);
		int[] right = Arrays.copyOfRange(nums, mid, nums.length);

		ParallelMergeSort leftSide = new ParallelMergeSort(left);
		ParallelMergeSort rightSide = new ParallelMergeSort(right);

		invokeAll(leftSide, rightSide);

		merge(left, right, nums);
	}

	private void mergeSort(int[] nums) {

		if (nums.length <= 1) {
			return;
		}

		int mid = nums.length / 2;

		int[] left = Arrays.copyOfRange(nums, 0, mid);
		int[] right = Arrays.copyOfRange(nums, mid, nums.length);

		mergeSort(left);
		mergeSort(right);

		merge(left, right, nums);
	}

	private void merge(int[] left, int[] right, int[] full) {

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				full[k++] = left[i++];
			} else {
				full[k++] = right[j++];
			}
		}

		while (i < left.length)
			full[k++] = left[i++];

		while (j < right.length)
			full[k++] = right[j++];
	}
}