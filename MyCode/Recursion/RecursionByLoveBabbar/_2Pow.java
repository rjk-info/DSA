public class _2Pow {

    public static int pow(int n) {
        // base case
        if(n == 0) {
            return 1;
        }
        // recursive relation
        
        int sp = pow(n-1) ;
        int bp = 2 * sp ;
        return bp ;
    }
    public static void main(String[] args) {
        System.out.println(pow(5));
    }
}
