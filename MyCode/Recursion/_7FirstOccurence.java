public class _7FirstOccurence {

    public static int firstOcc(int arr[] , int k, int i) {

        if(i == arr.length ) {
            return -1 ;
        }

        if(arr[i] == k) {
            return i;
        }

        return firstOcc(arr, k, i+1) ;
       
    }
    public static void main(String[] args) {

        int arr[] = {8,3,6,9,5,10,2,5,3} ;
        int k = 5  ;
        System.out.println(firstOcc(arr, k,0) );
    }
}
