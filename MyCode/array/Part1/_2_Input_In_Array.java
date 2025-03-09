// package MyCode.array.Part1;
import java.util.*;

public class _2_Input_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int [100];
        System.out.println("Enter physics marks");
        marks[0] = sc.nextInt() ;
        System.out.println("Enter che marks");
        marks[1] = sc.nextInt() ;
        System.out.println("Enter maths marks");
        marks[2] = sc.nextInt() ;

        System.out.println("phy " + marks[0]);
        System.out.println("che " + marks[1]);
        System.out.println("maths " + marks[2]);

        // marks[2] = marks[2] + 1; 
        // System.out.println("maths " + marks[2]);


        // calculate avarage of marks

        int avg = (marks[0] + marks[1] + marks[2] ) / 3;
        System.out.println("avg = " + avg);

        // find array length 
        System.out.println("length of array is = " + marks.length);
    }
}
