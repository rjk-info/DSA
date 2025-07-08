public class _3kadaneAlgo {
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
    
         Kadanes1(num);
    }
}
    
