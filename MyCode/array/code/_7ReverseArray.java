import java.util.*;
public class _7ReverseArray {

  public static void reverse(int numbres[]) {
    int first = 0 , last = numbres.length - 1 ;

    while (first < last) {
      // swap
      int temp = numbres[last] ;
      numbres[last] = numbres[first] ;
      numbres[first] = temp ;

      first++ ;
      last-- ;
    }
  }
  public static void main(String[] args) {

    int numbres[] = { 1, 2, 3, 4, 5, 6} ;
    reverse(numbres);
    for(int i = 0 ; i < numbres.length ; i++) {
      System.out.println(numbres[i]+" ");
    }
      System.out.println();
  }
}
