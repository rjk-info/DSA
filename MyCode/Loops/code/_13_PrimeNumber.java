// check if a number is prime or not 
import java.util.Scanner;
public class _13_PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true ;
        if(n<2) {
            isPrime = false ;
        }
                   
        if(n == 2) {
            isPrime = true ;
        } 
       
        for(int i=2;i<Math.sqrt(n);i++){
            if (n % i == 0) {
                isPrime = false ;
            }
        }
    if (isPrime == true) {
        System.out.println(n +" is prime number");
    }else{
        System.out.println(n +" is not a prime number");
    }
}
}
