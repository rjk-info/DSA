public class _6_Binomial_Coefficient {
    public static int Factorial(int n) {   
        int fact = 1 ;
        for(int i = 1 ; i<= n ; i++) {
            fact = fact * i ;
            }
            return fact ;
    }

    public static int BioCoffe(int n , int r) {
        int fact_n = Factorial(n) ;
        int fact_r = Factorial(r) ;
        int fact_nmr = Factorial(n-r) ;
        int BioCoffe = fact_n / (fact_r * fact_nmr) ;
        return BioCoffe ;
    }
    public static void main(String[] args) {
        System.out.println(BioCoffe(5,2 ));
    }
}
