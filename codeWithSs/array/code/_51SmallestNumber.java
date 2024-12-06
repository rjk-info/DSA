import java.util.*;
public class _51SmallestNumber
{

  public static int getSmallest(int numbres[]) {
    int smallest = Integer.MAX_VALUE; // + infinity

    for(int i = 0; i < numbres.length; i++) {
      if (smallest > numbres[i]) {
        smallest = numbres[i];
        
      }
  }
  return smallest;
}

  public static void main(String[] args) {
int numbres[] = { 1, 2, 3, 4, 5, 6} ;
int showsmallest = getSmallest(numbres);
System.out.println("Smallest value is : "+showsmallest);
  }
}
