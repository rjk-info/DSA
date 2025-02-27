// package MyCode.Function;
import java.util.Scanner;
public class _2_SyntaxWithPara {
    // public static void Sum(int a , int b ) {
    //     int sum = a + b; 
    //     System.out.println("sum of a and b is " + sum);
    // }

    public static int Sum(int a , int b ) { //parameters or formal parameters
        int sum = a + b; 
        return sum ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: - ");
        int a = sc.nextInt();
        System.out.println("Enter second number: - ");
        int b = sc.nextInt();
        // Sum(a, b);
        int sum = Sum(a, b);// arguments or actual parameters
        System.out.println("The sum of both number is " + sum);
    }
}
