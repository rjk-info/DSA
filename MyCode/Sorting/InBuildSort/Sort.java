import java.util.*;
public class Sort {
    public static void main(String[] args) {
        Integer array[] = {5,4,1,3,2};

        Arrays.sort(array); // This will sort the array in ascending order

         Arrays.sort(array,0,3); 
         Arrays.sort(array,Collections.reverseOrder()); // This will sort the array in descending order
        
        System.out.println("Original Array: " + Arrays.toString(array));

        // for(int i = 0 ; i <array.length ;i++){
        //     System.out.print(array[i]+" ");
        // }
        // System.out.println();

        // comprarator

    }
    public static int compare(int a,int b){
        // a<b return -1;
        // a>b return 1;
        // a==b return 0;
        return a - b; // This will sort in ascending order
    }
}
