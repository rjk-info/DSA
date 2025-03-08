// package MyCode.AdvancePattern;

public class _2_Inverted_Roted_py {

    public static void InvertedPy(int tRow , int tCol){
        // outer loop
        for(int i = 1 ; i <= tRow ; i++){
            // for space
            for(int j = 1 ; j <= tRow - i ; j++){
                System.out.print(" ");
            }
            // for star
            for(int k = 1 ; k <= i; k++){
                System.out.print("*");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        InvertedPy(5, 5);
    }
}
