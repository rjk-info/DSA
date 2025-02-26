import java.util.Scanner;
public class _12_Question {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
   

    while (true) {

      System.out.println("Enter a number");
      int num = sc.nextInt() ;
      if(num % 10 == 0) {
        continue ;
      } 
        System.out.println(num);
        if(num %11 ==  0){
          break;
        }
      } 
     
    }
  }

