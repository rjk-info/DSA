// package MyCode.AdvancePattern;

public class _1_HollowRectangle {

    public static void Hollow_Ractangle(int totalRow , int totalCol) {
        for (int i = 1; i <= totalRow; i++) {
            for (int j = 1; j <= totalCol; j++) {
                if (i == 1 || i == totalRow || j == 1 || j ==totalCol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Hollow_Ractangle(4, 5);
    }
}
