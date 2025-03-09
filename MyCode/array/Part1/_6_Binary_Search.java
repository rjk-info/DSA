// package MyCode.array.Part1;

public class _6_Binary_Search {
    public static int BinaryS(int num[] , int key){
        int start = 0 , end = num.length - 1 ;

        while (start <= end) {
            int mid= (start + end) / 2 ;

            if (num[mid] == key) { // found
                return mid ;
            }
            if (num[mid] < key) { // right
                start = mid + 1 ;
            }else{             // left     
                end = mid - 1 ;
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12,14} ;
        int key = 10 ;
        System.out.println("index for key is : " + BinaryS(num, key));
    }
}
