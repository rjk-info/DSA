// package MyCode.array.Part1;
import java.util.*;
public class _5_Largest_number {

    public static int LargestNum(int number[]){
        int Lnum = Integer.MIN_VALUE;
        for(int i = 0 ; i <number.length ; i++){
            if (number[i] > Lnum) {
                Lnum = number[i] ;
            }
        }
        return  Lnum ;
    }
    public static void main(String[] args) {
        int [] number = {1,2,3,4,5,6,7,8,0} ;
        int LargestN = LargestNum(number) ;
        System.out.println("largest number is = "+ LargestN);
    }
}
