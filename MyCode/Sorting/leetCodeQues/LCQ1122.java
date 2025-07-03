/*
 * * LeetCode Question 1122: Relative Sort Array
 * * * Problem Statement:
 * * Given two arrays arr1 and arr2, the elements of arr2 are distinct,
 * * * and all elements in arr2 are also in arr1.
 * * * Sort the elements of arr1 such that the relative ordering of items in arr1
 * * is the same as in arr2.
 * * * Elements that do not appear in arr2 should be placed at the end of arr
 * * in ascending order.
 * * * Example:
 * * Input: arr1 = [2,3,1,3,2,4], arr2 = [3,2]
 * * Output: [3,3,2,2,1,4]
 */
class LCQ1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for (int num : arr1) {
            count[num]++;
        }

        int index = 0;
        int[] result = new int[arr1.length];

        for (int num : arr2) {
            while (count[num]-- > 0) {
                result[index++] = num;
            }
        }

        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                result[index++] = i;
            }
        }

        return result; 
    }
}
