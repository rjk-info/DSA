// package PracticeQuesions;
// Write a program that reads a set of integers , and then prints the sum of the even and odd integers.
import java.util.*;
public class _2SumOfOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (enter a non-integer to stop): ");
        int evenSum = 0;
        int oddSum = 0;
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
        
        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);
        
        scanner.close();
    }
}
