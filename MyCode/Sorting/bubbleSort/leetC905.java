/*
 * LeetCode Problem 905: Sort Array By Parity
 * Given an integer array nums, move all the even integers at the beginning of the array followed
 * by all the odd integers. Return any array that satisfies this condition.
 * * Example:
 * Input: nums = [3,1,2,4]
 * Output: [2,4,3,1]
 */

class leetC905 {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0 , j = nums.length - 1 ;
        while(i<j){
            if(nums[i] % 2 > nums [j] % 2){
                int temp = nums[i];
                nums[i] = nums[j] ;
                nums[j] = temp ;
            }
            if(nums[i] % 2 == 0) i++ ;
            if(nums[j] % 2 == 1) j-- ;
        }
        return nums ;
    }
}