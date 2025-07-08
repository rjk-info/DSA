import java.util.*;
class PSQ1 {
    public static void lowerCase(String str){
        int count = 0 ;
        for(int i = 0 ; i<str.length(); i++){
            int s = str.charAt(i);
            if(s =='a' | s == 'e' | s == 'i' | s == 'o' | s == 'u' ){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter any string");
        String str = sc.nextLine();
        lowerCase(str);
        // System.out.println("name is = " +str);
    }
}