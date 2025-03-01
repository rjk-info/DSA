// package PracticeQ;

public class _3_Palindrome {

    public static void Palindrome(int num) {
        int Num = num ;
        int revNum = 0 ;
        while (num > 0) {
            int lastd = num % 10 ;
            revNum = revNum * 10 + lastd;
            num = num / 10 ;
        }
        if (Num == revNum) {
            System.out.println("number is palidrome number");
        }else{
            System.out.println("not pladrome");
        }
    }
    public static void main(String[] args) {
        Palindrome(122);
    }
}
