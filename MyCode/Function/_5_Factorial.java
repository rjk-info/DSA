// package MyCode.Function;

public class _5_Factorial {
    public static int Factorial(int n) {   
        int fact = 1 ;
        for(int i = 1 ; i<= n ; i++) {
            fact = fact * i ;
            }
            return fact ;
    }
    public static void main(String[] args) {
        int n = 4  ;
       int fact =  Factorial(n) ;
       System.out.println(fact);
    }
}
