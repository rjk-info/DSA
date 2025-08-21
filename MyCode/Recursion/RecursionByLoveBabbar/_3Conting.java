public class _3Conting {

    public static void printCount(int n) {
        // Base case
        if(n == 0){
         return  ;
        }

        // recursion 
        System.out.println(n);
         printCount(n-1);
      

    }
    public static void main(String[] args) {
        printCount(5) ;
    }
}
