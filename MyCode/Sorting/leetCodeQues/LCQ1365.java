/*
 * * LeetCode Question 1365: How Many Numbers Are Smaller Than the Current Number 
 * * * Problem Statement:
 * * You are given an integer array nums. For each nums[i], count how many numbers
 * * * are smaller than it in the array. Return the answer in the form of an array.
 * * * Example:
 * * Input: nums = [8,1,2,2,3]
 * * Output: [4,0,1,1,3]
 */

class LCQ1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int arr[] = new int [n] ;

        for(int i = 0 ; i<n; i++){
           int  count = 0 ;
            for(int j = 0 ; j<n; j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            arr[i] = count ;
        }
        return arr ;
    }
}