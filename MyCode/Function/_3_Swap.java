// package MyCode.Function;

public class _3_Swap {

    public  static void swap(int a , int b ) {
        int temp ;
        temp = a ;
        a = b;
        b = temp;
        System.out.println(a + " " + b);

    }
    public static void main(String[] args) {
        int a = 10; 
        int b = 20 ;
        System.out.println("Before swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("After swapping");
        swap(a , b);

    }
}
