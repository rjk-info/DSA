public class _2CheckOddOrEven {

    public static void oddOrEven(int n){
        int bitMask = 1 ;
        if((n & bitMask) == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        oddOrEven(10);
        oddOrEven(11);
        oddOrEven(0);
        oddOrEven(-1);
    }
}
