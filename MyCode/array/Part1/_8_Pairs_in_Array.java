public class _8_Pairs_in_Array {

    public static void PairsArray(int num[]) {
        int count = 0;
        for(int i = 0 ; i < num.length ; i++) {
            int curr = num[i]; // 2, 4  , 6 , 8, 10
            for(int j = i + 1 ; j < num.length ; j++) {
                System.out.print("("+ curr + "," + num[j] + ")");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total pairs found: " + count);
    }
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
    PairsArray(num);        
    }
}
