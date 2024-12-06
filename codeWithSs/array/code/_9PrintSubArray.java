import java.util.*;
public class _9PrintSubArray {

public static void printSubArray(int numbres[]) {
  int totalSubArray = 0;
  for(int i = 0 ; i < numbres.length ; i++) {
    int start = i ;
    for(int j = i ; j < numbres.length ; j++) {
      int end = j ;
      for(int k = start ; k <= end ; k++) { // print 
        System.out.print(numbres[k]+" "); // print sub array
}
totalSubArray++ ;
System.out.println();
}
System.out.println();
  }
  System.out.println("total sub array is "+totalSubArray);
}

  public static void main(String[] args) {
    int numbres[] = {2, 4,6,8,10};
    printSubArray(numbres);
  }
}
