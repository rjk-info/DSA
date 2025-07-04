//leetcode problem 867. Transpose Matrix
class Solution {
    public int[][] transpose(int[][] arr) {
         int rows = arr.length;
        int cols = arr[0].length;
        int [][] tran = new int[cols][rows] ;

        
         for(int i = 0 ; i<rows;i++){
            for(int j =0 ;j<cols;j++){
              tran[j][i] = arr[i][j];
            }
         }
        
         for(int i = 0 ; i<cols;i++){
            for(int j =0 ;j<rows;j++){
              System.out.print(tran[i][j]+" ");
            }
            System.out.println();
            
    }
    return tran;
}
}