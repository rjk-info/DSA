public class _4Home {


    public static void reachHome(int src , int dest) {

        System.out.print("sorce "+src);
        System.out.println(" destionation  "+dest);

        // base case
        if(src == dest) {
        System.out.println("pahuch gaya");
        return;
        }

        // processing - ek step aage badh jao
        src++;

        //recursive call 

        reachHome(src, dest);
    }
    public static void main(String[] args) {
        int dest = 10 ;
        int src = 1 ;
        reachHome(src, dest) ;
    }
}
