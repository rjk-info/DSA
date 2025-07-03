/*
 * LeetCode 912 - Sort an Array
 * Given an array of integers nums, sort the array in ascending order using Bubble Sort.
 * * Example:
 * Input: nums = [5, 4, 1, 3, 2
 * * Output: [1, 2, 3, 4, 5]
 * Note: This implementation uses Bubble Sort, which is not the most efficient sorting algorithm.
 */
class leetCode912 {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // Optimization to stop early if already sorted
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap nums[j] and nums[j + 1]
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swaps happened, array is already sorted
            if (!swapped) break;
        }
        return nums;
    }
}
