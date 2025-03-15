// package LeetCode;

class Code {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int item : nums) {
            if (count == 0) {
                candidate = item;
                count = 1;
            } else {
                count += (candidate == item) ? 1 : -1;
            }
        }
        return candidate;
    }

    public int majorityElementAlternative(int[] nums) {
        int count = 0;
        int ans = 0;
        for (int item : nums) {
            if (count == 0) {
                ans = item;
                count = 1;
            } else {
                count += (ans == item) ? 1 : -1;
            }
        }
        return ans;
    }
}