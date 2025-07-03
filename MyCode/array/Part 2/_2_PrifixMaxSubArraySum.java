public class _2_PrifixMaxSubArraySum {

    public static void PrifixSumArray(int nums[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length ];
        prefix[0] = nums[0];
        
        // Calculate prefix sum
        for(int i = 1 ;i<prefix.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        for(int i = 0 ; i<nums.length; i++) {
            int start = i ;
            for(int j = i ; j<nums.length; j++){
                int end = j ;
               
                currentSum = start == 0  ?  prefix[end] : - prefix[start-1] ;

                System.out.println(currentSum);
                 if(currentSum > maxSum) {
                maxSum = currentSum;
            }
           
            }
        }
    }

    public static void Kadanes1(int nums[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0 ; i<nums.length; i++) {
            cs += nums[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("Max Subarray Sum using Kadane's Algorithm: " + ms);
    }

    public static void main(String[] args) {
         int num[] = {-2,1,-3,4,-1,2,1,-5,4}; ;
        //  PrifixSumArray(num) ;
         Kadanes1(num);
    }
}
