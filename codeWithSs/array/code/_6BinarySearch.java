import java.util.*;
public class _6BinarySearch {

  public static int binarySearch(int numbres[] , int key) {
    int start = 0 , end = numbres.length - 1 ;

    while (start <= end) {
      int mid = (start + end) / 2 ;

      // comparisons

      if(numbres[mid] == key) { // found
        return mid ;
    }
    if (numbres[mid] < key) { // right
      start = mid + 1 ;
      
    }else { // left
      end = mid - 1 ;
    }

  }
  return -1 ;
}
  public static void main(String[] args) {
    int numbres[] = {2,4,6,8,10,12,14} ;
    int key = 12 ;
    System.out.println("index for key is :" + binarySearch(numbres, key));
  }
}
