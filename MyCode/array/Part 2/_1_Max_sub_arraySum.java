// package MyCode.array.Part1;

public class _1_Max_sub_arraySum {
    public static void printMaxSubSum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

  for(int i = 0 ; i<numbers.length ; i++) {
    int start = i ;
    for(int j = i ; j<numbers.length ; j++) {
        int end = j; 
        currSum = 0;
        for(int k = start ; k<=end ; k++) {
            currSum += numbers[k];
        }
        System.out.println(currSum);
        if(currSum > maxSum) {
            maxSum = currSum;
        }
    }
  }
    System.out.println("Max sub array sum : " + maxSum);
    }
   
     public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        printMaxSubSum(numbers);
        // System.out.println("Max sub array sum : " + maxSubArraySum(numbers));
        // System.out.println("Max sub array sum : " + maxSubArraySum2(numbers));
        // System.out.println("Max sub array sum : " + maxSubArraySum3(numbers));

     }
 }