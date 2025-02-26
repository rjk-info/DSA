// Write a program to find the factorialof any number entered by the user

// public package PracticeQuesions;
import java.util.Scanner;

class _3_factorialN {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int fact = 1 ;
    for(int i = 1 ; i < n ; i++) {
        fact+= fact * i ;
       
    }
    System.out.println(n + " factorial is " + fact);
}
    
}