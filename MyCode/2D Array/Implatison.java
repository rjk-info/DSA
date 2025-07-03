import java.util.*;
public class Implatison {
    
    // Search in a 2D matrix

    public static boolean search(int matrix[][] , int key){
        for(int i=0;i<matrix.length; i++){
            for(int j = 0 ; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Element found at index : " + i + " " + j);
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        int matrix[][] = new int [3][3];
        int n = 3, m = 3;

        // int n = matrix.length; // number of rows
        // int m = matrix[0].length; // number of columns
        System.out.println("Enter the elements of the matrix : ");
        Scanner sc = new Scanner(System.in) ;

        for(int i = 0 ;i<n; i++){
            for(int j = 0 ;j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // Printing the matrix
        System.out.println("The matrix is : ");
         for(int i = 0 ;i<n; i++){
            for(int j = 0 ;j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 5); // Searching for the element 5
    }
}
