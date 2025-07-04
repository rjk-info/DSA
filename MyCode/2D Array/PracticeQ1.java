import java.util.*;

class PracticeQ1 {
    public static void Search(int arr[][],int t ){
        int count = 0 ;
        int sum = 0 ;
         for(int i = 0 ; i<arr.length;i++){
            for(int j =0 ;j<arr[0].length;j++){
                if(arr[i][j] == t)
                count++;
                sum += arr[i][j];
            }
        }
         System.out.println("The count of element is = "+count) ;
         System.out.println(sum);
    }
    public static void main(String[] args) {
        int arr[][] = {{4,7,8},{8,8,7}};
        int t = 7;
        
       Search(arr,t);
        
    }
}