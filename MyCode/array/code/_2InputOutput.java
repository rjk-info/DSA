import java.util.Scanner;

public class _2InputOutput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int marks[] = new int[50]  ;

    System.out.println("Enter your math marks: ");
    marks[0] = sc.nextInt() ;

    System.out.println("Enter your math marks:");
    marks[1] = sc.nextInt() ;

    System.out.println("Enter your math marks:");
    marks[2] = sc.nextInt() ;

    System.out.println("Math marks : " + marks[0] );
    System.out.println("Phy marks : " + marks[1] );
    System.out.println("Che marks : " + marks[2] );

    marks[2] = marks[2] + 2 ;
    System.out.println("Che marks : " + marks[2] );

    int avg = (marks[0] + marks[1] + marks[2] ) /3 ;
    System.out.println("Average : " + avg );

    System.out.println("length of array = " + marks.length );
}
}