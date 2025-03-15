// package MyCode.array.Part1;

public class _Live_1_swap {

    public static void Swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + " b = " + b) ;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        Swap(a,b) ;
        System.out.println("After swapping: a = " + a + " b = " + b) ;
    }
}
