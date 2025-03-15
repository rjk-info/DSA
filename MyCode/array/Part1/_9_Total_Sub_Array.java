// package MyCode.array.Part1;

public class _9_Total_Sub_Array {
    public static void TotalPairs(int num[]) {
        int tsA = 0 ;
        for(int i = 0 ; i<num.length ; i++){
            int start = i ;
            for(int j = i ; j < num.length ; j++) {
                int end = j ;
               for(int k = start ; k <= end ; k++) {
                   System.out.print(num[k] + " ") ;
               }
               tsA ++ ;
                System.out.println();
            }
            System.out.println();
        }
         System.out.println("total sub array = " + tsA);
    }
     public static void main(String[] args) {
         int num[] = {2,4,6,8,10} ;
         TotalPairs(num) ;
         
     }
 }