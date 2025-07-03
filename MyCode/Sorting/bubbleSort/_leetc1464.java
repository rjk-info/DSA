/*Maximum Product of Two Elements in an Array
 * Given the array of integers arr, find the maximum product of two elements in an array such that the two elements are not equal to each other.
 * Note that the product of two numbers is equal to the product of their values minus one.
 */

class _leetc1464 {
    public int maxProduct(int[] arr) {
        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Now the two largest elements will be at the end
        int n = arr.length;
        return (arr[n - 1] - 1) * (arr[n - 2] - 1);
    }
}
