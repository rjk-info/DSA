// package codeWithSs.Loops.code;
import java.util.Scanner;
public class _4_Print1ToN {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt(); ;
    int a = 1 ;
    while (a <= n) {
      System.out.print(a + " ") ;
      a++;
      
    }
    System.out.println();
    System.out.println("Printed 1 to " + n);
  }
  
}
