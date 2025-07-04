// leetcode problem 54: Spiral Matrix

import java.util.*;
class SpiralMatrix {
    public static void printSpiral(int matrix[][]){
        int sR = 0 ;
        int sC = 0 ;
        int eR = matrix.length -1 ;
        int eC = matrix[0].length-1 ;
        
        while(sR <= eR && sC <= eC){
            // top 
            for(int j = sC; j<=eC;j++){
                System.out.print(matrix[sR][j]+" ");
            }
            //right
            for(int i = sR+1; i<=eR; i++){
                System.out.print(matrix[i][eC]+" ");
            }
            //button 
            for(int j = eC-1 ;j>=sC;j--){
                if(sR == eR){
                    break;
                }
                System.out.print(matrix[eR][j]+" ");
            }
            
            // left
            for(int i = eR -1;i>=sR;i--){
                  if(sC == eC){
                    break;
                }
                System.out.print(matrix[i][sC]+" ");
            }
            sC++;
            sR++;
            eC--;
            eR--;
        }
    }
    public static void main(String[] args) {
      int matrix[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        printSpiral(matrix);
    }
}

