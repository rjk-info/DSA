public class _1Fact {

    public static int printFact(int n) {
        if(n==0) {
            return 1;
        }
        int chotti = printFact(n-1) ;
        int badi = n * chotti;
        return badi ;
    }
    public static void main(String[] args) {
        int n = 5 ;
        System.out.println(printFact(n));
    }
}