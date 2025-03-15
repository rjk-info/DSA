// package MyCode.array.Part1;

public class _1_Max_sub_array {
    public static void MaxSubArraySum(int num[]) {
        int currSum = 0 ;
        int maxSum = Integer.MIN_VALUE ;

        for(int i = 0 ; i<num.length ; i++){
            int start = i ;
            for(int j = i ; j < num.length ; j++) {
                int end = j ;
                currSum = 0 ;
               for(int k = start ; k <= end ; k++) {
                  // sub array sum 
                  currSum += num[k] ;
               }
                System.out.print(currSum + " ") ;
               if (maxSum < currSum) {
                   maxSum = currSum ;
                
               }
               System.out.println();
            }
            System.out.println();
        }
    }
     public static void main(String[] args) {
         int num[] = {2,4,6,8,10} ;
         MaxSubArraySum(num) ;
         
     }
 }