public class _11_Dec_to_Bin {
    public static void DecToBin(int num) {
        int OrgNum = num;
        int BinNum = 0;
        int pow = 0;
        while (num > 0) {
            int reminder = num % 2;
            BinNum = BinNum+ (reminder *(int)(Math.pow(10, pow))) ;
           pow++ ;
           num = num/2 ;
        }
        System.out.println(BinNum);
    }
    public static void main(String[] args) {
        DecToBin(8);
    }
}