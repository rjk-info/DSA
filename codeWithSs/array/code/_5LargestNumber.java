import java.util.*;
public class _5LargestNumber {

  public static int getLargest(int numbres[]) {
    int largest = Integer.MIN_VALUE; // -infinity

    for(int i = 0; i < numbres.length; i++) {
      if (largest < numbres[i]) {
        largest = numbres[i];
        
      }
  }
  return largest;
}

  public static void main(String[] args) {
int numbres[] = { 1, 2, 3, 4, 5, 6} ;
int showLargest = getLargest(numbres);
System.out.println("largest value is : "+showLargest);
  }
}
