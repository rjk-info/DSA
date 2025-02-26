import java.util.*;
public class _8PairsInArray {

public static void printPairs(int numbres[]) {
  int totalPairs = 0 ;
  for(int i=0; i<numbres.length;i++) {
    int cuur = numbres[i]; // 2,4,6,8,10
    for(int j=i+1; j<numbres.length;j++) {
      System.out.print("(" + cuur + "," + numbres[j] + ")");
      totalPairs++;
  }
  System.out.println();
}
System.out.println("total pairs = " + totalPairs);
}
  public static void main(String[] args) {
    int numbres[] = {2, 4, 6, 8, 10};
    printPairs(numbres);

  }
}
