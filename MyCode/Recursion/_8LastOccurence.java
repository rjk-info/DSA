public class _8LastOccurence {

    public static int lastOcc(int arr[], int k, int i) {
        if (i == arr.length) {
            return -1;
        }

        int isFound = lastOcc(arr, k, i + 1); // ✅ Fixed missing comma

        if (isFound != -1) {
            return isFound;
        }

        if (arr[i] == k) {
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int k = 5;
        System.out.println(lastOcc(arr, k, 0));
    }
}
