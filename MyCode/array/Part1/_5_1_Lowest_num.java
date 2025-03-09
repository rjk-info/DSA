// package MyCode.array.Part1;
import java.util.*;
public class _5_1_Lowest_num {

    public static int LowestN(int number[]){
        int LowNum = Integer.MAX_VALUE ;

        for(int i = 0 ; i< number.length ; i++) {
            if (number[i] < LowNum) {
                LowNum = number[i] ;
            }
        }
        return LowNum ;
    }
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5,6,10,11} ;
        System.out.println("Lowest no is this array is = "+LowestN(number));
    }
}
