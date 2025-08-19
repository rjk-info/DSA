public class _12FriendsPairing {

    public static int friendsPairing(int n){
        if(n ==1 || n ==2) {
            return n ;
        }
        //choice
        //StringBuilder

        int fnm1 = friendsPairing(n - 1) ;

        // pair 

        int fnm2 = friendsPairing(n-2) ;

        int pairWasy = (n-1) *fnm2 ;

        // totWays

        int totWays = fnm1 + pairWasy ;
        return totWays ;
    }
    public static void main(String[] args) {
       
        System.out.println( friendsPairing(3) );
    }
}
