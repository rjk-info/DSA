// leet code problem 75: Sort Colors
/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.*/


// Time Complexity: O(n^2)

class BubbleSort {
    public static void bubbleSort(int arr[]) {
        for(int i = 0 ; i<arr.length-1 ; i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp ;
                    temp = arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ;
                }
            }
        }
    }
    
public static void printArr(int arr[]){
    for(int i = 0 ; i<arr.length; i++){
        System.out.print(arr[i]+" ") ;
    }
    System.out.println();
}
    public static void main(String[] args) {
       int arr[] = {5,4,1,3,2};
       bubbleSort(arr);
       printArr(arr);
    }
}