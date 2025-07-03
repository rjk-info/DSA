
/*
 * LeetCode Problem: 1470 - Shuffle the Array
 * Problem Statement:
 * Given the array nums consisting of 2n elements in the form [x1, x2, ..., xn, y1, y2, ..., yn].
 * Return the array in the form [x1, y1, x2, y2, ..., xn, yn].
 * Example:
 * Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7]
 */
class LeetCode1470 {
    public int[] shuffle(int[] nums, int n) {
        int n1 = nums.length ;
        int ans[] = new int [n1] ;

    for(int i = 0 ; i<n ; i++){
        ans[2*i] = nums[i] ;
        ans[2*i + 1] = nums[i + n] ;
    }
 return ans ;
    }
}