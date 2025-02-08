// package codeWithSs.Loops.code;
import java.util.Scanner;
public class _5_Print_SumOfN_natural_numbers {
  public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    int sum = 0;
    int i = 1;
    while (i <= n) {
      System.out.print(i + " ");
      sum = sum + i;
      i++; 
    }
    System.out.println();
    System.out.println("Sum of first " + n + " natural numbers is: " + sum);
  }
}
