/*
 * LeetCode Question 1051: Height Checker
 * Problem Statement:
 * You are given an array of integers heights representing the heights of students in a class.  
 * Each student can be represented by their height, and the heights are not necessarily in order.
 * Your task is to return the number of students whose heights are not in the expected order.
 * The expected order is that the heights should be sorted in non-decreasing order.
 * You need to count how many students are not in their expected position.
 * Example:
 * Input: heights = [1,1,4,2,1,3]
 * Output: 3
 */

import java.util.* ;
class LCQ1051 {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int expected[] = new int[n] ;
        int count = 0 ;

        /*
         int[] expected = Arrays.copyOf(heights, n); // Copy original array
        Arrays.sort(expected); // Sort the copy
         */

        for(int i = 0 ; i<n;i++){
            expected[i] = heights[i] ;
        }
            Arrays.sort(expected);
        
         for(int i = 0 ; i<n;i++){
            if(heights[i] != expected[i]){
                count++ ;
            }
        }
        return count ;
    }
}
