public class _10_Binary_to_Decimal {
    public static void BinaryToDec(int n){
        int myNum = n ;
        int pow = 0 ;
        int decNum = 0 ;
        while (n > 0) {
            int lastD = n % 10 ;
            decNum = decNum + (lastD * (int)Math.pow(2, pow)) ;
            pow++;
            n = n / 10 ;
        }

        System.out.println("Decimal of " +myNum+" =" +decNum);
    }
    public static void main(String[] args) {
        BinaryToDec(101) ;
    }
}
