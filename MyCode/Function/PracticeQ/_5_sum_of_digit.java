// package PracticeQ;

public class _5_sum_of_digit {
    public static void Dsum(int num) {
        int Num = num ;
        int Dsum1 = 0 ;
        while (num > 0) {
            int lastd = num % 10 ;
            Dsum1 = Dsum1 + lastd ;
            num = num / 10 ;
        }
        System.out.println("Sum of digit of number" + Num + " is = "+Dsum1);
    }
    public static void main(String[] args) {
        Dsum(12223);
    }
}
